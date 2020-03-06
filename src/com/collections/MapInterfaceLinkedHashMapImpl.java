package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterfaceLinkedHashMapImpl {

 public static void main(String[] args) {
  linkedHashMap();
 }

 // Maintain insertion order.
 private static void linkedHashMap() {
  // Constructs an empty insertion-ordered LinkedHashMap instance with the
  // default
  // initial capacity (16) and load factor (0.75).
  Map<String, String> linkedHahMap = new LinkedHashMap<>();
  linkedHahMap.put("key1", "value1");
  linkedHahMap.put("key3", "value3");
  linkedHahMap.put("key2", "value2");
  linkedHahMap.put("key0", "value0");

  // loop linkedHahMap using java 8 forEach method
  linkedHahMap.forEach((k, v) -> {
   System.out.println(k);
   System.out.println(v);
  });

  // loop linkedHahMap using before java 8 forEach method
  for (Entry pair : linkedHahMap.entrySet()) {
   System.out.println(pair.getKey());
   System.out.println(pair.getValue());
  }
 }
}