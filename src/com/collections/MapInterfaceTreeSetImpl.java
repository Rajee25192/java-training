package com.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapInterfaceTreeSetImpl {
    public static void main(String[] args) {
    treeMapDemo();
 }

 // maintain keys in ascending order.
 private static void treeMapDemo() {
     // Constructs a new, empty tree map, using the natural ordering of its
     // keys
      Map<String, String> treeMap = new TreeMap<>();
      treeMap.put("key1", "value1");
      treeMap.put("key3", "value3");
      treeMap.put("key2", "value2");
      treeMap.put("key0", "value0");

      // loop linkedHahMap using java 8 forEach method
      treeMap.forEach((k, v) -> {
      System.out.println(k);
      System.out.println(v);
  });

     // loop linkedHahMap using before java 8 forEach method
     for (Entry pair : treeMap.entrySet()) {
         System.out.println(pair.getKey());
         System.out.println(pair.getValue());
     }
     
  // Creating a TreeMap with a Custom comparator (Descending order)
     SortedMap<String, Integer> numberWordMapping = new TreeMap<>(Comparator.reverseOrder());
     // Adding new key-value pairs to a TreeMap
     numberWordMapping.put("one", 1);
     numberWordMapping.put("two", 2);
     numberWordMapping.put("three", 3);
     numberWordMapping.put("five", 5);
     numberWordMapping.put("four", 4);

     // Printing the TreeMap (The keys will be sorted based on the supplied
     // comparator)
     System.out.println(numberWordMapping);
   }
 
 
}