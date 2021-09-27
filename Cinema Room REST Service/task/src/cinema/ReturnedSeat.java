package cinema;

public class ReturnedSeat {

    public Seat returned_ticket;

    ReturnedSeat(Seat seat) {
        this.returned_ticket = seat;
    }

    public Seat getReturned_ticket() {
        return returned_ticket;
    }

    public void setReturned_ticket(Seat returned_ticket) {
        this.returned_ticket = returned_ticket;
    }
}
