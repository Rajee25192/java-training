package com.multithreading;

import java.util.concurrent.Callable;

class SumNumbers implements Callable<Integer> {
     private int n;
 
     public SumNumbers(int n) {
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
         System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
         return sum;
     }
}