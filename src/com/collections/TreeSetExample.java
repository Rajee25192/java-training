package com.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String args[]){
	TreeSet<String> fruits = new TreeSet<>();

	// Adding new elements to a TreeSet
	fruits.add("Banana");
	fruits.add("Apple");
	fruits.add("Pineapple");
	fruits.add("Orange");

	System.out.println("Fruits Set : " + fruits);

	// Duplicate elements are ignored
	fruits.add("Apple");
	System.out.println("After adding duplicate element \"Apple\" : " + fruits);

	// This will be allowed because it's in lowercase.
	fruits.add("banana");
	System.out.println("After adding \"banana\" : " + fruits);
	
	
	// Creating a TreeSet with a custom Comparator (Descending  Order)
	SortedSet<Integer> weekDays = new TreeSet<>();
	// Adding new elements to a TreeSet
	weekDays.add(1);
	weekDays.add(3);
	weekDays.add(4);
	weekDays.add(2);
	weekDays.add(5);
	

	System.out.println("weekDays Set : " + weekDays);
	}
}
