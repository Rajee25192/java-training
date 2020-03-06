package com.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureInterface {
 
 public static void main(String[] args) throws InterruptedException, ExecutionException {
  
      System.out.println("Thread main started");
  
      ExecutorService executorService = Executors.newSingleThreadExecutor();
      Future<Integer> returnedValues = executorService.submit(new SumNumbers(10));
      System.out.println("Result of Future object:: " + returnedValues.get());
      executorService.shutdown();
  
      System.out.println("Thread main finished");
   }
}