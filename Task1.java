package Hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("введите значение элемента массива № " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println("значения массива в прямом направлении:");
        for (int arrayElement : array) {
            System.out.print(arrayElement + "  ");
        }
        System.out.println();
        System.out.println("значения массива в обратном направлении:");
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1] + "  ");
        }
    }
}
