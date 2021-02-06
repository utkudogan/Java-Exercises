package com.utkudogan;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is private to main";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varthree is " + scopeInstance.getPrivatevar());
        System.out.println(privateVar);

        scopeInstance.timesPrivateVar();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesPrivateVar();
    }
}
