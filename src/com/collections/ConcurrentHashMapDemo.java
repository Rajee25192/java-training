package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// Java program to demonstrate working of ConcurrentHashMap 
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> m = new ConcurrentHashMap<String, String>();
		m.put("100", "Hello");
		m.put("101", "Geeks");
		m.put("102", "Geeks");
		System.out.println("Concurrent Hash Map is : " + m);

		Iterator<String> it = m.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			if (key.equals("100")) {
				m.put(key + "1", "Good");
			}
		}
		System.out.println("After loop : " + m);

		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("100", "Hello");
		m1.put("101", "Geeks");
		m1.put("102", "Geeks");
		System.out.println(" Hash Map is : " + m1);

		Iterator<String> it1 = m1.keySet().iterator();

		while (it1.hasNext()) {
			String key = it1.next();
			if (key.equals("100")) {
				m1.put(key + "1", "Good");
			}
		}
		System.out.println("After loop : " + m1);
	}
}
