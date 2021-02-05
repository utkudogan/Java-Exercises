package com.udogan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    Scanner scanner = new Scanner(System.in);
    public int[] getIntegers(int sizeOfTheArray){
        return new int[sizeOfTheArray];
    }

    public void printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println(i + ". array member is " + array[i]);
        }
    }

    public int[] sortIntegers(int[] unsortedArray){
        boolean flag = true;
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        while (flag){
            flag = false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
