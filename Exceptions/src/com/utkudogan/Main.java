package com.utkudogan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAPP(x, y));
//        System.out.println(divide(x, y));
//        int x = getx();
//        System.out.println("x is " + x);
//        int x = getIntLBYL();
//        System.out.println("x is " + x);
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getx(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return scanner.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }

    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean isvalid = true;
        System.out.println("Please enter an integer");
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                isvalid = false;
                break;
            }
        }
        if (isvalid){
            return Integer.parseInt(input);
        }else {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }

    private static int divideEAPP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
