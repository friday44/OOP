package Exep1;

// Реализуйте 2 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class hw1 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {11, 12, 13, 14, 15, 16};
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(subtractionArr(arr1, arr2)));

    //    System.out.println(Arrays.toString(divisionArr(arr1, arr2)));

    }
    public static int[] subtractionArr(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException(String.format("Длина массива 1: %d, длина массива 2: %d.", array1.length, array2.length));
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

//    public static double[] divisionArr(int[] array1, int[] array2) {
//        if (array1.length != array2.length) {
//            throw new RuntimeException("Длины массивов не одинаковые");
//        }
//
//        double[] result = new double[array1.length];
//        for (int i = 0; i < array1.length; i++) {
//            result[i] = array1[i] / array2[i];
//        }
//        return result;
//    }

}
