package com.collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
     // Creating Deque and adding elements
     Deque<String> deque = new ArrayDeque<String>();
     deque.add("element1");
     deque.add("element2");
     deque.add("element3");
     // Traversing elements
     for (String str : deque) {
        System.out.println(str);
     }
   }
}