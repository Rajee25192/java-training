package com.multithreading;

import java.util.concurrent.*;

public class FutureCompletionCheck {
 
    public static void main(String[] args) throws InterruptedException, ExecutionException {
  
        System.out.println("Thread main started");
  
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> returnedValues = executorService.submit(() -> {
             int sum = 0;
             for (int i = 1; i <= 5; i++) {
    
                sum += i;
             try {
                 Thread.sleep(200);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
            System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
            return sum;
       });
  
        while(!returnedValues.isDone()) {
             System.out.println("Task is still not done...");
             Thread.sleep(200);
         }
   
         System.out.println("Result of Future object:: " + returnedValues.get());
         executorService.shutdown();
  
         System.out.println("Thread main finished");
    }
}