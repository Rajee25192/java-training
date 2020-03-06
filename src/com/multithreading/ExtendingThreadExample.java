package com.multithreading;
class WorkerThread1 extends Thread {
     private String anyData;
 
     public WorkerThread1(final String anyData) {
          this.anyData = anyData;
     }
 
     @Override
     public void run() {
     for (int i = 0; i < 5; i++) {
          System.out.println("[" + Thread.currentThread().getName() + "] "
          + "[data=" + this.anyData + "] Message " + i);
     try {
         Thread.sleep(200);
     } catch (final InterruptedException e) {
         e.printStackTrace();
     }
   }
}
}



public class ExtendingThreadExample {
 
    public static void main(final String[] args) {
  
         System.out.println("Thread main started");

         final Thread thread = new WorkerThread1("Process data using WorkerThread"); 
         thread.start();
         thread.setName("WorkerThread");
  
         System.out.println("Thread main finished");
    }
}