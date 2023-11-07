public class Seat {

    final int seatNumber = 1;
    final int seatRow = 1;
    private boolean reserved = true;

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getSeatRow(){
        return seatRow;
    }

    public boolean getReserved(){
        return reserved;
    }

    public void setReserved(boolean reserved){
        if (reserved == true){
            this.reserved = reserved;

        }
        else if (reserved == false){
            this.reserved = reserved;

        }
    }

    public void getSeatOneInfo() {

        System.out.println("Numer miejsca: "+seatNumber);
        System.out.println("Numer rzędu: "+seatRow);
        System.out.println("Czy jest zarezerwowane: "+reserved+"\n");
    }
}
