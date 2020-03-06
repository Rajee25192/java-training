package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceHashImpl {

 public static void main(String[] args) {
  nullValueDemo();
  duplicateValueDemo();
  //bulkOperationDemo();
 }

 // Set can contain one null value
 private static void nullValueDemo() {
  Set<String> set = new HashSet<>();
  set.add(null);
  set.add(null);
  System.out.println(set.toString());
 }

 // it is not contain duplicate elements
 private static void duplicateValueDemo() {
  Set<String> set = new HashSet<>();
  set.add("element1");
  set.add("element1");
  set.add("3456");
  set.add("789");
  set.add("eshiu");
  // displays only one element
  System.out.println(set.toString());
 }
}