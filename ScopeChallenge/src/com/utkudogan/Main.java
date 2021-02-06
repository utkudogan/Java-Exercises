package com.utkudogan;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        X x = new X();
        x.x();
    }

    public static Scanner x (){
        return (new Scanner(System.in));
    }

    public static class X {
        public int x =  Main.x().nextInt();
        public void x (){
            System.out.println(" The Times Table: ");
            for (int x = 1; x < 13; x++) {
                System.out.println(x + " times " + this.x + " = " + x*this.x);
            }
        }
    }
}
