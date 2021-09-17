package cinema;

import java.util.*;


public class Cinema {

    int total_rows;
    int total_columns;
    SortedMap<String, Seat> seats = new TreeMap<>();
//    List<Seat> available_seats = new ArrayList<>();

    public Cinema(int rows, int columns) {
        this.total_rows = rows;
        this.total_columns = columns;
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= columns; k++) {
                seats.put((i + ", " + k), new Seat(i, k));
//                available_seats.add(new Seat(i, k));
            }
        }
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public void setTotal_rows(int total_rows) {
        this.total_rows = total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public void setTotal_columns(int total_columns) {
        this.total_columns = total_columns;
    }

    public SortedMap<String, Seat> getSeats() {
        return seats;
    }

    public void setSeats(SortedMap<String, Seat> seats) {
        this.seats = seats;
    }
}