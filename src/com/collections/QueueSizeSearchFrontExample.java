package com.collections;
import java.util.LinkedList;
import java.util.Queue;


public class QueueSizeSearchFrontExample {
    public static void main(String[] args) {
        Queue<String> elementQueue = new LinkedList<>();

		/*
		 * elementQueue.add("element1"); elementQueue.add("element2");
		 * elementQueue.add("element3"); elementQueue.add("element4");
		 * 
		 * System.out.println("WaitingQueue : " + elementQueue);
		 * 
		 * // Check is a Queue is empty System.out.println("is waitingQueue empty? : " +
		 * elementQueue.isEmpty());
		 * 
		 * // Find the size of the Queue System.out.println("Size of waitingQueue : " +
		 * elementQueue.size());
		 * 
		 * // Check if the Queue contains an element String name = "Johnny";
		 * if(elementQueue.contains(name)) { System.out.println("WaitingQueue contains "
		 * + name); } else { System.out.println("Waiting Queue doesn't contain " +
		 * name); }
		 */

        // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
      //  String firstElementInTheWaitingQueue =  elementQueue.element();
   //     System.out.println("Waiting Queue (element()) : " + firstElementInTheWaitingQueue);

        // Get the element at the front of the Queue without removing it using peek()
        // The peek() method is similar to element() except that it returns null if the Queue is empty
      String  firstElementInTheWaitingQueue = elementQueue.peek();
        System.out.println("Waiting Queue : " + firstElementInTheWaitingQueue);

    }
}