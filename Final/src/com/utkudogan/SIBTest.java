package com.utkudogan;

public class SIBTest {
    public static final String owner;

    static {
        owner = "utku";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd initialization static block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
