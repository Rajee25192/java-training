package com.collections;
// Java program illustrating use of HashMap methods - 
// put(), get(), isEmpty() and size() 
import java.util.*; 
public class HashMapExample 
{ 
	public static void main(String args[]) 
	{ 
		// Creation of HashMap 
		HashMap<String, String> hash = new HashMap<>(); 

		// Adding values to HashMap as ("keys", "values") 
		hash.put("Language", "Java"); 
		hash.put("Language","C++");
		hash.put("Platform", "Independent"); 
		hash.put("Code", "HashMap"); 
		hash.put("Learn", "More"); 

		System.out.println("Testing .isEmpty() method"); 

		// Checks whether the HashMap is empty or not 
		// Not empty so printing the values 
		if (!hash.isEmpty()) 
		{ 
			System.out.println("HashMap  is notempty"); 

			// Accessing the contents of HashMap through Keys 
			System.out.println("XXXX : " + hash.get("Language")); 
			System.out.println("YYYY : " + hash.get("Platform")); 
			System.out.println("ZZZZ : " + hash.get("Code")); 
			System.out.println("WWWW : " + hash.get("Learn")); 

			// size() method prints the size of HashMap. 
			System.out.println("Size Of HashMap : " + hash.size()); 
		} 
	} 
} 
