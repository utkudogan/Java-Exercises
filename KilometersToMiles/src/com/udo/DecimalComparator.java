package com.udo;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        long derivedFirstNumber = (long)(firstNumber*1000);
        long derivedSecondNumber = (long)(secondNumber*1000);

        if (firstNumber*secondNumber<0){
            return false;
        }
        if (derivedFirstNumber == derivedSecondNumber){
            return true;
        }
        return false;
    }
}
