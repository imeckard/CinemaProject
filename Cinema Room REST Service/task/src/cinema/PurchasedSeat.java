package cinema;

public class PurchasedSeat {

    private String token;
    private Seat ticket;

    public PurchasedSeat(Seat seat) {
        this.token = seat.getToken().toString();
        this.ticket = seat;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Seat getTicket() {
        return ticket;
    }

    public void setTicket(Seat ticket) {
        this.ticket = ticket;
    }
}
