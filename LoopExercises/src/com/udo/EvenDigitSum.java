package com.udo;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        if (number / 10 == 0) {
            if (number % 2 == 0) {
                return number;
            } else {
                return 0;
            }
        }

        int sum = 0;

        while (number / 10 > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        if (number % 2 == 0) {
            return sum + number;
        } else {
            return sum;
        }

    }
}
