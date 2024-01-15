package Hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("получен массив:\n" + Arrays.toString(array));
        int maxElement = 0;
        int indexMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                indexMaxElement = i;
            }
        }
        System.out.println("индекс макимального элемента массива равен: " + indexMaxElement);
        int minElement = maxElement;
        int indexMinElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
                indexMinElement = i;
            }
        }
        System.out.println("индекс минимального элемента массива равен: " + indexMinElement);
    }
}
