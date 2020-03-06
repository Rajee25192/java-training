package com.multithreading;
public class NamingThreadExample {
 
     public static void main(final String[] args) {
  
        System.out.println("Thread main started");

        final Thread thread1 = new WorkerThread3();
        thread1.setName("WorkerThread1");
  
        final Thread thread2 = new WorkerThread3();
        thread2.setName("WorkerThread2");
  
        final Thread thread3 = new WorkerThread3();
        thread3.setName("WorkerThread3");
  
        final Thread thread4 = new WorkerThread3();
        thread4.setName("WorkerThread4");
  
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
  
        System.out.println("Thread main finished");
    }
}

class WorkerThread3 extends Thread {
 
     @Override
     public void run() {
          System.out.println("Thread Name :: " + Thread.currentThread().getName());
     }
}