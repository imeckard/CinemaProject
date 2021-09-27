package cinema;

public class StatBlock {

    private int current_income;
    private int number_of_available_seats;
    private int number_of_purchased_tickets;

    public StatBlock(Cinema cinema) {
        this.current_income = cinema.currentIncome();
        this.number_of_available_seats = cinema.countAvailableSeats();
        this.number_of_purchased_tickets = cinema.countPurchasedTickets();
    }


    public int getCurrent_income() {
        return current_income;
    }

    public void setCurrent_income(int current_income) {
        this.current_income = current_income;
    }

    public int getNumber_of_available_seats() {
        return number_of_available_seats;
    }

    public void setNumber_of_available_seats(int number_of_available_seats) {
        this.number_of_available_seats = number_of_available_seats;
    }

    public int getNumber_of_purchased_tickets() {
        return number_of_purchased_tickets;
    }

    public void setNumber_of_purchased_tickets(int number_of_purchased_tickets) {
        this.number_of_purchased_tickets = number_of_purchased_tickets;
    }
}
