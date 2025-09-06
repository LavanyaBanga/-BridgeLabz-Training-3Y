public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayDetails() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie : " + movieName);
        System.out.println("Seat  : " + seatNumber);
        System.out.println("Price : " + price);
    }

        public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");
        ticket1.bookTicket(15, 350.0);

        ticket1.displayDetails();

        System.out.println();
        MovieTicket ticket2 = new MovieTicket("Inception");
        ticket2.bookTicket(7, 250.0);
        ticket2.displayDetails();
    }
}
