package com.utkudogan;

public class Main {

    public static void main(String[] args) {
        String varFive = "this is private to main";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varthree is " + scopeInstance.getVarOne());
        System.out.println(varFive);

        scopeInstance.timesPrivateVar();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesPrivateVar();
        scopeInstance.useInnerClass();
    }
}
