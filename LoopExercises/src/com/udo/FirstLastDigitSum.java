package com.udo;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1;
        }

        if (number / 10 == 0) {
            return  number + number;
        }

        int numberEdited = number;
        int numberOfDigit = 0;

        for (numberOfDigit = 1; numberEdited / 10 > 0 ; numberOfDigit++) {
            numberEdited /= 10;
        }

        return numberEdited + number%10;
    }
}
