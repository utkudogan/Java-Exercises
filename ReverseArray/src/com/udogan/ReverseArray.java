package com.udogan;

import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[array.length - 1 - i];
            reversedArray[array.length - 1 - i] = temp;
        }

        System.out.print("Array = " + Arrays.toString(array));
        System.out.print("Reversed Array = " + Arrays.toString(reversedArray));

    }
}
