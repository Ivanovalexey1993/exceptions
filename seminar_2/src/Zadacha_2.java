import java.util.Arrays;

public class Zadacha_2 {
    public static void main(String[] arg){
        int [] intArray = {8,2,32,43,5,6,6,7,9};

        System.out.println("Искомый первый массив: " + Arrays.toString(intArray));
   try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
}}
