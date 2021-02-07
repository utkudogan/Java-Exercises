package com.utkudogan;

public class Main {
    public static int multiplier = 7;
    public static void main(String[] args) {
        //ExampleOne exampleOne = new ExampleOne();

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
    }

    public static int multiply(int number){
        return number * multiplier;
    }
}
