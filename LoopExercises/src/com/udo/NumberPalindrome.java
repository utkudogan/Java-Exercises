package com.udo;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number < 0) {
            number *= -1;
        }

        if (number/10 == 0){
            return true;
        }
        
        int numberEdited = number;
        int numberReversed = 0;
        int numberOfDigit = 0;
                
        for (numberOfDigit = 1; numberEdited / 10 > 0 ; numberOfDigit++) {
            numberEdited /= 10;
        }
        
        numberEdited = number;
        
        while(numberEdited > 0){
            int digit = numberEdited % 10;

            for (int i = 1; i < numberOfDigit; i++) {
                digit *= 10;
            }
            numberOfDigit--;
            numberReversed += digit;
            numberEdited /= 10;
        }

        System.out.println("NumberReversed: " + numberReversed + "NumberOfDigit: " + numberOfDigit);

        if (number == numberReversed) {

            return true;
        }
        return false;
    }


}
