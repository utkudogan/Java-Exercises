package com.utkudogan;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int password = 13145;
        Password password1 = new Password(password);
        password1.storePassword();
        password1.letMeIn(135321);
        password1.letMeIn(35);
        password1.letMeIn(13145);
    }
}
