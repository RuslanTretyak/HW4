package Hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("получен массив:\n" + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= array[i]) {
                System.out.println("массив не является возрастающей последовательностью");
                break;
            } else if (i == array.length - 2) {
                System.out.println("массив является возрастающей последовательностью");
            }
        }
    }
}
