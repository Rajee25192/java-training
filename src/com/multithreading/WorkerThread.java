package com.multithreading;
public class WorkerThread implements Runnable {
    private String data;
 
    public WorkerThread(final String anyData) {
       this.data = anyData;
    }
 
    @Override
    public void run() {
       for (int i = 0; i < 5; i++) {
           System.out.println("[" + Thread.currentThread().getName() + "] [data=" + 
           this.data + "] Message " + i);
           try {
               Thread.sleep(200);
           } catch (final InterruptedException e) {
               e.printStackTrace();
           }
      }
   }
}