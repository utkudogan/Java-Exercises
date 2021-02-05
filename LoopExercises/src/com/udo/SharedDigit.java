package com.udo;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }

        int firstNumberDigit1 = firstNumber % 10;
        int firstNumberDigit2 = firstNumber / 10;
        int secondNumberDigit1 = secondNumber % 10;
        int secondNumberDigit2 = secondNumber / 10;

        if (firstNumberDigit1 == secondNumberDigit1 || firstNumberDigit1 == secondNumberDigit2 || firstNumberDigit2 == secondNumberDigit1 || firstNumberDigit2 == secondNumberDigit2) {
            return true;
        }

        return false;
    }
}
