//3.	Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен
//        разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.


import java.util.Arrays;

public class Zadacha_3 {

    public static void main(String[] arg){
        int [] arrey1 = {15,2,32,43,5};
        int [] arrey2 = {6,76,87,9, 1};

        System.out.println("Искомый первый массив" + Arrays.toString(arrey1));
        System.out.println("Искомый второй массив" + Arrays.toString(arrey2));
        if (arrey1.length != arrey2.length){
            throw new RuntimeException("Массивы разной длины");
        } else
        {System.out.print("Полученный массив ");
            for (int i = 0; i < 5; i++) {
                int[] arrey3 = new int[arrey1.length];
                arrey3[i] = arrey1[i] - arrey2[i];
        System.out.print(" " + arrey3[i]);
    }}}}