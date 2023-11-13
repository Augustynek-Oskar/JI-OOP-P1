import java.lang.management.MonitorInfo;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("\"Alien vs. Predator\"", "Paul W.S. Anderson",  101, 2004);
        movie.getMovieDetails();

        Seat seat1 = new Seat(14,5);
        seat1.getSeatInfo();

        Seat seat2 = new Seat(13,5);
        seat2.getSeatInfo();

        Seat seat3 = new Seat(1,2);
        seat3.getSeatInfo();

    }

}
