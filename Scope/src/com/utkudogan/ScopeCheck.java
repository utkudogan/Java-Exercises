package com.utkudogan;

public class ScopeCheck {
    public int publicvar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("ScopeCehck created, publicVar = " + publicvar + ", privateVar = " + privateVar);
    }

    public int getPrivatevar() {
        return privateVar;
    }

    public void timesPrivateVar(){
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times privateVar is " + i * privateVar);
            System.out.println(i + " times privateVar is " + i* this.privateVar);
        }
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privatevar is " + privateVar);
        }

        public void timesPrivateVar(){
            int privateVar = 4;
            for (int i = 0; i < 3; i++) {
                System.out.println(i + " times privateVar is " + i * privateVar);
                System.out.println(i + " times privateVar is " + i* this.privateVar);
                System.out.println(i + " times privateVar is " + i* ScopeCheck.this.privateVar);
            }

            ScopeCheck.this.timesPrivateVar();
        }
    }
}
