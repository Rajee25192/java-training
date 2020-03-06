package com.multithreading;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCancelling {

 public static void main(String[] args) {

  System.out.println("Thread main started");

  long startTime = System.nanoTime();

  ExecutorService executorService = Executors.newSingleThreadExecutor();
  Future<Integer> returnedValues = executorService.submit(() -> {
   int sum = 0;
   for (int i = 1; i <= 5; i++) {
    sum += i;
   }
   System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
   return sum;
  });

  while (!returnedValues.isDone()) {
   System.out.println("Task is still not done...");
   returnedValues.cancel(true);
  }

  try {
   System.out.println("Result of Future object:: " + returnedValues.get());
  } catch (InterruptedException | ExecutionException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  executorService.shutdown();

  System.out.println("Thread main finished");
 }
}