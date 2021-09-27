package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CinemaController {

    Cinema myCinema = new Cinema(9,9);


    @GetMapping("/seats")
    public Cinema getSeats() {
        return myCinema;
    }

    @PostMapping("/purchase")
    public ResponseEntity<?> purchaseSeat(@RequestBody RequestedSeat request) {
        int row = request.getRow();
        int column = request.getColumn();
        String requestSeat = (row + ", " + column);
        if (row > myCinema.total_rows || row <= 0 || column > myCinema.total_columns || column <= 0) {
            return new ResponseEntity<>(Map.of("error", "The number of a row or a column is out of bounds!"),
                    HttpStatus.BAD_REQUEST);
        }
        for (Seat seat : myCinema.getAvailable_seats()) {
            if (seat.getSeatKey().equals(requestSeat) && seat.isAvailable()) {
                seat.setAvailable(false);
                PurchasedSeat purchasedSeat = new PurchasedSeat(seat);
                return new ResponseEntity<>(purchasedSeat, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(Map.of("error", "The ticket has been already purchased!"),
                HttpStatus.BAD_REQUEST);
    }
    @PostMapping("/return")
    public ResponseEntity<?> returnSeat(@RequestBody ReturnedToken returnedToken) {

        for (Seat seat : myCinema.getAvailable_seats()) {
            if (seat.getToken().equals(returnedToken.getToken()) && !seat.isAvailable()) {
                seat.setAvailable(true);
                return new ResponseEntity<>(new ReturnedSeat(seat), HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(Map.of("error", "Wrong token!"),
                HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/stats")
    public ResponseEntity<?> getStats(@RequestParam(required = false) String password) {
        if (password != null && password.equals("super_secret")) {
            return new ResponseEntity<>(new StatBlock(myCinema), HttpStatus.OK);
        }
        return new ResponseEntity<>(Map.of("error", "The password is wrong!"),
                HttpStatus.UNAUTHORIZED);
    }

}
