package com.udogan;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.print("Invalid Value");
            return;
        }

        for (int row = 1; row <= number ; row++) {
            for (int column = 1; column <= number; column++) {
                if (row == 1 || row == number){
                    System.out.print("*");
                    continue;
                }else if(column == 1 || column == number){
                    System.out.print("*");
                    continue;
                }else if(row == column){
                    System.out.print("*");
                    continue;
                }else if(column == number - row +1){
                    System.out.print("*");
                    continue;
                }else {
                    System.out.print(" ");
                    continue;
                }
            }
            System.out.println("");
        }
    }
}
