package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceArrayListImpl {

    public static void main(String[] args) {
        nullValueDemo();
        duplicateValueDemo();
    }

    private static void nullValueDemo() {

         List<String> list = new ArrayList<>();

         list.add(null);

         list.add(null);
 
         System.out.println(list.toString());
    }

    private static void duplicateValueDemo() {

         List<String> list = new ArrayList<>();

         list.add("duplicate");
  
         list.add("duplicate1");
 
          System.out.println(list.toString());

    }
}