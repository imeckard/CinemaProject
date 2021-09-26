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
    public ResponseEntity<?> purchaseSeat(@RequestBody Request request) {
        int row = request.getRow();
        int column = request.getColumn();
        String requestSeat = (row + ", " + column);
        if (row > myCinema.total_rows || row <= 0 || column > myCinema.total_columns || column <= 0) {
            return new ResponseEntity<>(Map.of("error", "The number of a row or a column is out of bounds!"),
                    HttpStatus.BAD_REQUEST);
        }
        for (Seat seat : myCinema.getAvailable_seats()) {
            if (seat.getSeatKey().equals(requestSeat)) {
                myCinema.getAvailable_seats().remove(seat);
                seat = new Seat(row,column);
                return new ResponseEntity<>(seat, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(Map.of("error", "The ticket has been already purchased!"),
                HttpStatus.BAD_REQUEST);
    }
}

class Request {

    public int row;
    public int column;

    Request() {}

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
