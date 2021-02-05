package com.udo;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first <10 || second<10) {
            return -1;
        }

        int divisor = 1;
        int greatestDivisor = 0;

        while ((divisor <= first) && (divisor <= second)){
            if ((first % divisor == 0) && (second % divisor == 0)) {
                greatestDivisor = divisor;
            }
            divisor++;
        }
        return greatestDivisor;
    }
}
