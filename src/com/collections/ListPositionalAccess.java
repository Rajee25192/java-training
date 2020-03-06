package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPositionalAccess {

	public static void main (String args[]){
		// The basic positional access operations are get, set, add and remove.
		    List<String> list = new LinkedList<>();
		    list.add("element 1");
		    list.add("element 2");
		    list.add("element 3");
		    list.add("element 4");
		    
		    List<String> arrayList = new ArrayList<>();
		    arrayList.add("element 0");
		    arrayList.addAll(list);
		    System.out.println("ArrayList " + arrayList);

		    arrayList.clear();
		    System.out.println("ArrayList :" +arrayList);
		    // Replaces the element at the specified position in this list with
		    // the specified element (optional operation).
		    list.set(3, "element 5");
		    list.forEach( str -> System.out.println(" set --" + str));

		    // Inserts the specified element at the specified position in this list
		    // (optional operation).
		    // Shifts the element currently at that position (if any) and any
		    // subsequent
		    // elements to the right (adds one to their indices).
		    list.add(3, "element 4");
		    list.forEach( str -> System.out.println(" set--" + str));

		    // Returns the element at the specified position in this list.
		    System.out.println(list.get(0));

		    // Removes the element at the specified position in this list (optional
		    // operation).
		    // Shifts any subsequent elements to the left (subtracts one from their
		    // indices).//
		    // Returns the element that was removed from the list.
		    list.remove(1);
		
		    
		    
		    List<String> searchList = new ArrayList<>();
		    searchList.add("element 1");
		    searchList.add("element 2");
		    searchList.add("element 3");
		    searchList.add("element 4");
		    searchList.add("element 2");

		    // Returns the index of the first occurrence of the specified element in
		    // this list,
		    // or -1 if this list does not contain the element.
		    int index = searchList.indexOf("element 2");
		    System.out.println(" search element at index 0 --->" + index);

		    // Returns the index of the last occurrence of the specified element in
		    // this list,
		    // or -1 if this list does not contain the element
		    int lastIndex = searchList.lastIndexOf("element 2");
		    System.out.println(" search element at lastIndex 0 --->" + lastIndex);
	}
}
