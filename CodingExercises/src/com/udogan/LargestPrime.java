package com.udogan;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }

        int largestPrime = 0;
        for (int i = 2; i <= number ; i++){
            boolean isPrime = true;
            if (number%i == 0){
                for (int j=2; j < i ;j++){
                    if (i%j == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    largestPrime = i;
                }
            }
        }

        if (largestPrime !=0){
            return largestPrime;
        }
        return -1;
    }
}
