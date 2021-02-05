package com.udo;

public class NumberToWords {
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int numberOfDigit = 1;

        for (; number / 10 > 0; numberOfDigit++) {
            number /= 10;
        }

        return numberOfDigit;
    }

    public static int reverse(int number){
        int numberEdited = number;

        if (number < 0) {
            numberEdited *= -1;
        }

        int numberOfDigit = getDigitCount(numberEdited);
        int numberReversed = 0;

        while(numberEdited > 0){
            int digit = numberEdited % 10;

            for (int i = 1; i < numberOfDigit; i++) {
                digit *= 10;
            }
            numberOfDigit--;
            numberReversed += digit;
            numberEdited /= 10;
        }

        if (number < 0) {
            numberReversed *= -1;
        }

        return numberReversed;
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int editedNumber = reverse(number);

        while (true){
            int digit = editedNumber % 10;
            switch (digit){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            editedNumber /= 10;

            if (editedNumber == 0) {
                break;
            }
        }

        if (getDigitCount(number) != getDigitCount(reverse(number))) {
            for (int i = 0; i < getDigitCount(number) - getDigitCount(reverse(number)); i++) {
                System.out.print("Zero ");
            }
        }
    }
}
