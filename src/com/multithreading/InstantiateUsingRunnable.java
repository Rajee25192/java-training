package com.multithreading;
public class InstantiateUsingRunnable {
 
    public static void main(final String[] args) {
  
        System.out.println("Thread main started");
  
        final Thread thread1 = new Thread(new WorkerThread("Process data through Runnable interface")); 
        thread1.start();
      
  
        System.out.println("Thread main finished");
    }
}