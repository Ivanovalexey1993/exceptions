import java.io.File;
//1.	Реализуйте 3 метода, чтобы в каждом из них получить разные исключения


import java.sql.SQLOutput;

public class Zadacha_1 {
    // Пример 1
//    public static int div (int a, int b) {
//        if (b == 0) {
//            throw new RuntimeException("Нельзя делить на ноль");
//        }
//        return a / b;
//    }

//    public static class Main {
//        public static void main(String[] args) {
//            int[] arrey = {1,2,3};
//            System.out.print(div(80, 0));
//        }
//    }}


// Пример 2
//    public static class Main {
//        public static void main(String[] args) {
//            int[] arrey = {1,2,3};
//            System.out.print(arrey[6]);
//        }}}


// Пример 3

    public static class Main {
        public static void main(String[] args) {
            System.out.println(getFileSize(new File("123")));
        }

        public static long getFileSize(File file) {
            if (!file.exists()) {
                return -1L;
            }
            return file.length();
        }
    }}

