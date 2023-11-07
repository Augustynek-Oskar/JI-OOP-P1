public class Seat {

    public void getSeatOneInfo() {
        final int seatNumber = 1;
        final int seatRow = 1;
        boolean reserved = true;
        System.out.println("Numer miejsca: "+seatNumber);
        System.out.println("Numer rzędu: "+seatRow);
        System.out.println("Czy jest zarezerwowane: "+reserved+"\n");
    }
    public void getSeatTwoInfo() {
        final int seatNumber = 2;
        final int seatRow = 1;
        boolean reserved = false;
        System.out.println("Numer miejsca: "+seatNumber);
        System.out.println("Numer rzędu: "+seatRow);
        System.out.println("Czy jest zarezerwowane: "+reserved+"\n");
    }
}
