package com.multithreading;

      // This program is not synchronized.
     class Callme1 {
          void  call(final String msg) {
               System.out.print("[" + msg);
               try {
                   Thread.sleep(1000);
               } catch (final InterruptedException e) {
                    System.out.println("Interrupted");
               }
              System.out.println("]");
         }   
    }

class Caller1 implements Runnable {
     protected String msg;
     protected Callme1 target;
     protected Thread t;

     public Caller1(final Callme1 targ, final String s) {
         target = targ;
         msg = s;
         t = new Thread(this);
         t.start();
     }

     @Override
     public void run() {
         target.call(msg);
     }
}

public class SynchronizedMethodExample1 {
     public static void main(final String args[]) {
          final Callme1 target = new Callme1();
          final Caller1 ob1 = new Caller1(target, "Hello");
          final Caller1 ob2 = new Caller1(target, "Synchronized");
          final Caller1 ob3 = new Caller1(target, "World");
          // wait for threads to end
           try {
               ob1.t.join();
               ob2.t.join();
               ob3.t.join();
           } catch (final InterruptedException e) {
               System.out.println("Interrupted");
           }
     }
}