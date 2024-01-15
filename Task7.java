package Hw4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        int[] array = {9,9,9,9};

        int multiplier = 1;
        int number = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            number += array[i] * multiplier;
            multiplier *= 10;
        }
        number++;
        int newArrayLength;
        if (number / (int) Math.pow(10, array.length) != 0) {
            newArrayLength = array.length + 1;
        } else {
            newArrayLength = array.length;
        }
        int[] newArray = new int[newArrayLength];
        int divider = (int) Math.pow(10, newArrayLength - 1);
        for (int i = 0; i < newArrayLength; i++) {
            newArray[i] = number / divider;
            number = number % divider;
            divider /= 10;
        }
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + Arrays.toString(newArray));
    }
}
