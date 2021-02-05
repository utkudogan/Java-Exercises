package com.udo;

public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        if ((13 <= firstNumber && firstNumber <= 19) || (13 <= secondNumber && secondNumber <= 19) || (13 <= thirdNumber && thirdNumber <= 19) ){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        if (age <= 19 && age >= 13){
            return true;
        }
        return false;
    }
}
