public class Main {

    public static boolean isItRectangularTriangle(int sideA, int sideB, int sideC){
        if((sideA * sideA) + (sideB * sideB) == (sideC * sideC)){
            return true;
        }else
            return false;
    }
}
