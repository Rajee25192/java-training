package com.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of String using
     List<String> animals = new ArrayList<>();
        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("1");
        System.out.println(animals);
        
        animals = new LinkedList<>();
    }
}