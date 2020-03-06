package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceLinkedHashSetImpl {
 public static void main(String[] args) {
  linkedHashSetDemo();
 }

 private static void linkedHashSetDemo() {
  Set<String> set = new LinkedHashSet<>();
  set.add("element 1");
  set.add("element 2");
  set.add("element 3");
  set.add("element 4");
  set.add(null);
  Iterator<String> iterator = set.iterator();
  while (iterator.hasNext()) {
   String str = iterator.next();
   System.out.println("LinkedHashSet does maintain " 
   + " insertion order ---" + str);
  }

  // loop using java 8
//  set.forEach(str -> System.out.println("LinkedHashSet does "
//  + " maintain insertion order ---" + str));
 }
}