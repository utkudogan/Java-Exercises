package com.utkudogan;

public class ExampleOne {
    public ExampleOne() {
        StaticTest firstInstance = new StaticTest("1st");
        System.out.println(firstInstance.getName() + " is intance number " + firstInstance.getNumInstances());

        StaticTest secondInstance = new StaticTest("3nd");
        System.out.println(secondInstance.getName() + " is intance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("2nd");
        System.out.println(thirdInstance.getName() + " is intance number " + StaticTest.getNumInstances());
    }
}
