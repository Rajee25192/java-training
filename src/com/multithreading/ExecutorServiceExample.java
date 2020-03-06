package com.multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        System.out.println("Thread main started");

        // Create a task
        Runnable task1 = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
            }
        };

       // Create a task
        Runnable task2 = () -> {
            for (int i = 0; i < 50; i++) {
                 System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
            }
        };

      // Create a task
       Runnable task3 = () -> {
           for (int i = 0; i < 50; i++) {
               System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
           }
       };

    // Create a task
      Runnable task4 = () -> {
          for (int i = 0; i < 50; i++) {
              System.out.println("[" + Thread.currentThread().getName() + "] " + "Message " + i);
          }
      };
      ExecutorService executorService = Executors.newFixedThreadPool(4);

      executorService.execute(task1);
      executorService.execute(task2);
      executorService.execute(task3);
      executorService.execute(task4);
 
      System.out.println("Thread main finished");

      executorService.shutdown();
   }
}