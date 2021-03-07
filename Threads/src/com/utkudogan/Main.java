package com.utkudogan;

import static com.utkudogan.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        //Thread myRunnableThread = new Thread(new MyRunnable());
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Anonymous class's implementation of run()");
                try {
                    anotherThread.join(1000);
                    System.out.println(ANSI_RED + "AnotherThread terminated.");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED + " I couldn't wait after all. ı was interrupted");
                }
            }
        });
        myRunnableThread.start();
        //anotherThread.interrupt();
        System.out.println(ANSI_PURPLE + "Hello again from the main thread");
    }
}
