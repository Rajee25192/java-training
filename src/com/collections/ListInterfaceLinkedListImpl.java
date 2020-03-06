package com.collections;

import java.util.LinkedList;
import java.util.List;

public class ListInterfaceLinkedListImpl {

	public static void main(String[] args) {/*
											 * List<Customer> listOfCustomer = new LinkedList<>();
											 * listOfCustomer.add(new Customer(100, "ramesh")); listOfCustomer.add(new
											 * Customer(101, "A")); listOfCustomer.add(new Customer(102, "B"));
											 * listOfCustomer.add(new Customer(103, "C")); listOfCustomer.forEach(
											 * customer -> { System.out.println(customer.getId());
											 * System.out.println(customer.getName()); });
											 */
  
		
		List<Customer> list = new LinkedList<>();
		list.add(new Customer(100,"ramesh"));
		list.add(new Customer(101,"sam"));
		list.forEach(cust -> System.out.println(cust.getName()));
		list.forEach(cust -> System.out.println(cust.getId()));
		System.out.println(list);
 }
 
 
}


