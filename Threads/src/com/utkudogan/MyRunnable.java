package com.utkudogan;
import static com.utkudogan.ThreadColor.ANSI_RED;
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "MyRunnable Class");
    }
}
