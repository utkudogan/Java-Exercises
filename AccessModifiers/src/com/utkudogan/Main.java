package com.utkudogan;
import com.test.ClassA;
public class Main {

    public static void main(String[] args) {
	    Account utkuAccount =  new Account("utku");
	    utkuAccount.deposit(131);
	    utkuAccount.withdraw(65);
	    utkuAccount.deposit(3123);
	    utkuAccount.withdraw(2330);
	    utkuAccount.calculateBalance();

        System.out.println("Balance is " + utkuAccount.getBalance());

        ClassA a = new ClassA();
        a.a();
    }
}
