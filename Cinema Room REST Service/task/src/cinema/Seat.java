package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;

public class Seat extends Object{

    private int row;
    private int column;
    private int price;
    @JsonIgnore
    private String seatKey;
    @JsonIgnore
    private String token;
    @JsonIgnore
    private boolean isAvailable;

    Seat() {}

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.price = (row <= 4 ? 10 : 8);
        this.seatKey = (row + ", " + column);
        this.token = UUID.randomUUID().toString();
        this.isAvailable = true;
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

    public String getSeatKey() {
        return seatKey;
    }

    public void setSeatKey(String seatKey) {
        this.seatKey = seatKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
