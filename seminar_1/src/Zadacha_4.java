//4.* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого
//        равен частному элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение,
//        которое пользователь может увидеть - RuntimeException, т.е. ваше.


import java.util.Arrays;

public class Zadacha_4 {

    public static void main(String[] arg){
        double [] arrey1 = {20,2,32,43,5};
        double [] arrey2 = {6,76,0,9, 4};

        System.out.println("Искомый первый массив" + Arrays.toString(arrey1));
        System.out.println("Искомый второй массив" + Arrays.toString(arrey2));
        if (arrey1.length != arrey2.length){
            throw new RuntimeException("Массивы разной длины");
        }
        else{
            System.out.print("Полученный массив ");
            for (int i = 0; i < 5; i++) {
                if (arrey2[i] == 0){
                    System.out.print(" ");
                    throw new RuntimeException("Деление на ноль");
                }else{
                    double[] arrey3 = new double[arrey1.length];
                    arrey3[i] = arrey1[i] / arrey2[i];
                    System.out.print(" " + arrey3[i]);
    }}}}}