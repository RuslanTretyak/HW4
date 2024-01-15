package Hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("получен массив:\n" + Arrays.toString(array));
        int tempElement = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tempElement = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tempElement;
        }
        System.out.println("преобразованный массив:\n" + Arrays.toString(array));
    }
}
