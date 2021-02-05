package com.udo;

public class FactorPrinter {
    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }

        for (int i = 0; i <= number; i++) {
            if (number%i==0){
                System.out.println(i + " ");
            }
        }
    }
}
