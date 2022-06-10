package com.akilesh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayToBeReversed = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Non-Reversed array " + Arrays.toString(arrayToBeReversed));
        reverse(arrayToBeReversed);
        System.out.println("Reversed array " + Arrays.toString(arrayToBeReversed));
    }

    private static void reverse(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];
        int count = -1;
        for (int i = (length - 1); i > -1; i--) {
            count++;
            reversedArray[count] = array[i];
        }
        System.arraycopy(reversedArray, 0, array, 0, length);
    }
}
