package cinema;

import java.util.*;


public class Cinema {

    int total_rows;
    int total_columns;
    List<Seat> available_seats = new ArrayList<>();

    public Cinema(int rows, int columns) {
        this.total_rows = rows;
        this.total_columns = columns;
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= columns; k++) {
                available_seats.add(new Seat(i, k));
            }
        }
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public List<Seat> getAvailable_seats() {
        return available_seats;
    }

    class Seat {
        int row;
        int column;

        public Seat(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }

}