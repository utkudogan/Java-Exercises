package com.utkudogan;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        }catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    public static int divide(){
        int x,y;
        x = getInt();
        y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x/y;

//        try {
//            x = getInt();
//            y = getInt();
//            System.out.println("x is " + x + ", y is " + y);
//            return x/y;
//        }catch (NoSuchElementException ex){
//            throw new NoSuchElementException("no suitable input");
//        }catch (ArithmeticException ex){
//            throw new ArithmeticException("Attempt to divide by sero");
//        }
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while (true){
            try {
                return scanner.nextInt();
            }catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Please enter a number");
            }
        }
    }
}
