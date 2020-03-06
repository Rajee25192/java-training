package com.multithreading;
class ThreadExtend extends Thread {
     private String anyData;
 
     public ThreadExtend(final String anyData) {
          this.anyData = anyData;
     }
 
     @Override
     public void run() {
     for (int i = 0; i < 10; i++) {
          System.out.println("[" + Thread.currentThread().getName() + "] "
          + "[data=" + this.anyData + "] Message " + i);
     try {
         Thread.sleep(5000);
     } catch (final InterruptedException e) {
         e.printStackTrace();
     }
   }
}
     
     public static void main(final String[] args) {
    	  
         System.out.println("Thread main started");

         final Thread thread = new ThreadExtend("Process data using WorkerThread"); 
         thread.start();
         thread.setName("mythread");
  
         System.out.println("Thread main finished");
    }
}

