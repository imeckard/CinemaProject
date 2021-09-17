package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Seat {

    private int row;
    private int column;
    private int price;
    @JsonIgnore
    private boolean isAvailable;

    Seat() {}

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.price = (row <= 4 ? 10 : 8);
    }



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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @JsonIgnore
    public boolean isAvailable() {
        return isAvailable;
    }

    @JsonIgnore
    public void setAvailable(boolean available) {
        isAvailable = available;
    }



}
