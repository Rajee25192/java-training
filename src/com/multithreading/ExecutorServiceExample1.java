package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
    public static void main(String[] args) {

        System.out.println("Thread main started");
  
       // Create a task
        Runnable task = () -> {
             for (int i = 0; i < 5; i++) {
                 System.out.println("[" + Thread.currentThread().getName() + "] " + "Message class 1 : " + i);
             }
        };

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
            }
       };

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(task);
        executorService.execute(task1);

        executorService.shutdown();
        
        System.out.println(executorService.isShutdown());

        System.out.println("Thread main finished");

     }
}