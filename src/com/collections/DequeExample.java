package com.collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
 public static void main(String[] args) {
  Deque<String> deque = new ArrayDeque<>();
  deque.offer("element1");
  deque.offer("element2");
  deque.add("element3");
  deque.offerFirst("element4");
  deque.offerLast("element5");
  System.out.println("After offerFirst Traversal...");
  for (String s : deque) {
   System.out.println(s);
  }
  // deque.poll();
  // deque.pollFirst();//it is same as poll()
  deque.pollLast();
  System.out.println("After pollLast() Traversal...");
  for (String s : deque) {
   System.out.println(s);
  }
 }
}