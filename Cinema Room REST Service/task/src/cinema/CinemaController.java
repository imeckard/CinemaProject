package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CinemaController {

    Cinema myCinema = new Cinema(9,9);

    @GetMapping("/seats")
    public Cinema getSeats() {
        return myCinema;
    }

    @PostMapping("/purchase")
    public void purchaseSeat(@RequestBody Request request) {
        String seatKey = request.getRow() + ", " + request.getColumn();
        if (!myCinema.getSeats().containsKey(seatKey)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "The number of a row or a column is out of bounds!");
        }
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