public class Seat {

    private final int seatNumber;
    private final int seatRow;
    private boolean reserved = true;

    public Seat (int seatNumber, int seatRow){
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;

    }

    public void getSeatNumber() {
        System.out.println(seatNumber);
    }

    public void getSeatRow(){
        System.out.println(seatRow);
    }

    public void getReserved(){
        System.out.println(reserved);
    }

    public void setReserved(boolean reserved){
        if (reserved == true){
            this.reserved = reserved;

        }
        else if (reserved == false){
            this.reserved = reserved;

        }
    }

    public void getSeatInfo() {

        System.out.println("Numer miejsca: " + seatNumber);
        System.out.println("Numer rzędu: " + seatRow);
        System.out.println("Czy jest zarezerwowane: " + reserved + "\n");

    }


}
