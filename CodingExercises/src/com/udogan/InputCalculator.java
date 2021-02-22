package com.udogan;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int numberOfEnters = 0;
        int sumOfEnters = 0;
        while (scanner.hasNextInt()){
            numberOfEnters++;
            sumOfEnters += scanner.nextInt();;
            scanner.nextLine();
        }
        System.out.print("SUM = " + sumOfEnters+ " AVG = " + (
                (numberOfEnters == 0) ? 0:(Math.round((double) sumOfEnters/numberOfEnters))));
    }
}
