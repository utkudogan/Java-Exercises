package com.utkudogan;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ", varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesPrivateVar(){
        int varTwo = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times varTwo is " + i * varTwo);
            System.out.println(i + " times varOne is " + i* this.varOne);
        }
    }

    public void useInnerClass(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varthree);
        System.out.println("private varSix from outer class: " + innerClass.varSix);
    }

    public class InnerClass {
        public int varthree = 3;
        private int varSix = 6;

        public InnerClass() {
            System.out.println("InnerClass created, varthree is " + varthree);
        }

        public void timesPrivateVar(){
            int varFour = 4;
            for (int i = 0; i < 3; i++) {
                System.out.println(i + " times varFour is " + i * varFour);
                System.out.println(i + " times varthree is " + i* this.varthree);
                System.out.println(i + " times varOne is " + i* ScopeCheck.this.varOne);
            }

            ScopeCheck.this.timesPrivateVar();
        }
    }
}
