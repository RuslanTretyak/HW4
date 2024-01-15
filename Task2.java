package Hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("получен массив:\n" + Arrays.toString(array));
        int maxElement = 0;
        for (int element : array) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        System.out.println("максимальное значение елемента массира равно: " + maxElement);
        int minElement = maxElement;
        for (int element : array) {
            if (element < minElement) {
                minElement = element;
            }
        }
        System.out.println("минимальное значение елемента массира равно: " + minElement);
    }
}
