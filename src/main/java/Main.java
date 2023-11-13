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

        BaseEmployee employee1 = new BaseEmployee("Oskar", "Augustynek",2020);
        Manager manager = new Manager("Jan", "Kowalski", 2018);
        TicketSeller ticketSeller = new TicketSeller("Adam", "Nowak", 2021);

        //zwróć kwotę podstawowego wynagrodzenia
        System.out.println(employee1.calculateMonthlySalary());
        System.out.println(manager.calculateMonthlySalary());
        System.out.println(ticketSeller.calculateMonthlySalary() + "\n");

        //zwróć informację ile lat pracownik pracuje w przedsiębiorstwie
        System.out.println(employee1.getYearsOfExperience());
        System.out.println(manager.getYearsOfExperience());
        System.out.println(ticketSeller.getYearsOfExperience() + "\n");

        //zwróć całkowite wynagrodzenie miesięczne każdego z pracowników
        System.out.println(employee1.totalSalary());
        System.out.println(manager.totalSalary());
        System.out.println(ticketSeller.totalSalary() + "\n");

        //Dodaj możliwość zmiany wysokości bonusu dla managera
        manager.setBonusSalary(550);
        System.out.println(manager.totalSalary());

    public static int getMinutesToSecondsConversion(int minutes){
        return minutes * 60;
    }

}
