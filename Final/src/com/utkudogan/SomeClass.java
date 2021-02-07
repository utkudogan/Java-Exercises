package com.utkudogan;

public class SomeClass {

    private static int classcounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name){
        this.name = name;
        classcounter++;
        instanceNumber = classcounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
