package com.udo;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int lastDigitOfNumber1 = number1 % 10;
        int lastDigitOfNumber2 = number2 % 10;
        int lastDigitOfNumber3 = number3 % 10;

        if (lastDigitOfNumber1 == lastDigitOfNumber2 || lastDigitOfNumber1 == lastDigitOfNumber3 || lastDigitOfNumber3 == lastDigitOfNumber2) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
