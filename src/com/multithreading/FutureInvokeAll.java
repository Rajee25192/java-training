package com.multithreading;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureInvokeAll {
 
 public static void main(String[] args) throws InterruptedException, ExecutionException {
  
  System.out.println("Thread main started");
  
  ExecutorService executorService = Executors.newFixedThreadPool(5);
  List<Future<Integer>> returnedValues = executorService.invokeAll(Arrays.asList(
    new SumNumbers1(50), 
    new SumNumbers1(40),
    new SumNumbers1(30),
    new SumNumbers1(20),
    new SumNumbers1(10)));
  
  for (Future<Integer> value : returnedValues) {
   System.out.println("Future object : "  +value.get());
  }
  
  executorService.shutdown();
  
  System.out.println("Thread main finished");
 }
}

class SumNumbers1 implements Callable<Integer> {
 private int n;
 
 public SumNumbers1(int n) {
  this.n = n;
 }
 
 public Integer call() {
  int sum = 0;
  for (int i = 1; i <= n; i++) {
   sum += i;
   try {
    Thread.sleep(200);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
  System.out.println("[" + Thread.currentThread().getName() + "] Sum " + sum);
  return sum;
 }
}