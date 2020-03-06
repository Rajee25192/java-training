package com.collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterateOverQueueExample {
    public static void main(String[] args) {
        Queue<String> elementsQueue = new LinkedList<>();

        elementsQueue.add("element1");
        elementsQueue.add("element2");
        elementsQueue.add("element3");
        elementsQueue.add("element4");

        System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");
        elementsQueue.forEach(name -> {
            System.out.println(name);
        });

        System.out.println("\n=== Iterating over a Queue using iterator() ===");
        Iterator<String> elementQueueIterator = elementsQueue.iterator();
        while (elementQueueIterator.hasNext()) {
            String name = elementQueueIterator.next();
            System.out.println(name);
        }

        System.out.println("\n=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===");
        elementQueueIterator = elementsQueue.iterator();
        elementQueueIterator.forEachRemaining(name -> {
            System.out.println(name);
        });

        System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
        for(String name: elementsQueue) {
            System.out.println(name);
        }
    }
}