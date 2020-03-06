package com.multithreading;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulingTasksWithScheduledThreadPool1 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main started");

        // Create a task
        Runnable task1 = () -> {
            System.out.println("Executing the task1 at: " + new Date());
        };

        // Create a task
        Runnable task2 = () -> {
            System.out.println("Executing the task2 at: " + new Date());
        };

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        System.out.println("Scheduling task to run after 5 seconds... " + new Date());
        scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(task2, 5, TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
        System.out.println("Thread main finished");
    }
}