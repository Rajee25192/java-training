package com.multithreading;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureInvokeAny {
 
 public static void main(String[] args) throws InterruptedException, ExecutionException {
  
  System.out.println("Thread main started");
  
  ExecutorService executorService = Executors.newFixedThreadPool(5);
  Integer returnedValues = executorService.invokeAny(Arrays.asList(
    new SumNumbers2(50), 
    new SumNumbers2(40),
    new SumNumbers2(30),
    new SumNumbers2(20),
    new SumNumbers2(10)));
  
  System.out.println(returnedValues);
  
  executorService.shutdown();
  
  System.out.println("Thread main finished");
 }
}

class SumNumbers2 implements Callable<Integer> {
 private int n;
 
 public SumNumbers2(int n) {
  this.n = n;
 }
 
 public Integer call() {
  int sum = 0;
  for (int i = 1; i <= n; i++) {
   sum += i;
  }
  System.out.println("[" + Thread.currentThread().getName() + "] Sum " + sum);
  return sum;
 }
}