//
//1.	Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Zadacha_1 {
    public static void main(String[] args) throws InterruptedException {

        boolean num=true;
        while (num) {
            System.out.print("Введите дробное число (типа float) \t");
            Scanner scanner = new Scanner(System.in);
            try {
                Float inputData = scanner.nextFloat();
                if (inputData instanceof Float) {
                    System.out.println("Это Float: " + inputData);
                }
            } catch (Exception e){
                throw new RuntimeException("Ввели не правильные данные: ");

            }
            }
        }
    }

