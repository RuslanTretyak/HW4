package Hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("получен массив:\n" + Arrays.toString(array));
        int countZeroElement = 0;
        for (int element : array) {
            if (element == 0) {
                countZeroElement++;
            }
        }
        if (countZeroElement != 0) {
            System.out.println("количество нулевых элементов массива равно: " + countZeroElement);
        } else {
            System.out.println("в массиве нет нулевых элементов");
        }
    }
}
