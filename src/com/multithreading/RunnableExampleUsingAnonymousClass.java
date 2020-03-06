package com.multithreading;
public class RunnableExampleUsingAnonymousClass {

    public static void main(final String[] args) {
        System.out.println(" main thread started : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");

        final Runnable runnable = new Runnable() {
   
             @Override
             public void run() {
                 System.out.println("Inside : " + Thread.currentThread().getName());
    
             }
        }; 

        final Runnable runnable1 = new Runnable() {
        	   
            @Override
            public void run() {
                System.out.println("Inside : " + Thread.currentThread().getName());
   
            }
       }; 
        System.out.println("Creating Thread...");
        final Thread thread = new Thread(runnable);
        final Thread thread1 = new Thread(runnable1);

        System.out.println("Starting Thread...");
        thread.start();
        thread1.start();
        
        System.out.println(" main thread ended : " + Thread.currentThread().getName());
    }
}