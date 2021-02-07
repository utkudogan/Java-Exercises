package com.utkudogan;

public class Password {
    private static final int key = 135321;
    private final int encrytedPassword;

    public Password(int enctytedPassword) {
        this.encrytedPassword = encryptDecrypt(enctytedPassword);
    }
    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public void storePassword(){
        System.out.println("Saving password as " + this.encrytedPassword);
    }

    public boolean letMeIn(int password){
        if (encryptDecrypt(password) == this.encrytedPassword) {
            System.out.println("welcome");
            return true;
        }else{
            System.out.println("nope");
            return false;
        }
    }
}
