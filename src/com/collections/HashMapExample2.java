package com.collections;
// Java Program illustrating HashMap class methods(). 
// entrySet(), getOrDefault(), replace(), putIfAbsent 
import java.util.*; 
public class HashMapExample2 
{ 
	public static void main(String args[]) 
	{ 
		// Creation of HashMap 
		HashMap<String, String> maps = new HashMap<>(); 

		// Adding values to HashMap as ("keys", "values") 
		maps.put("Language", "Java"); 
		maps.put("Code", "HashMap"); 
		maps.put("Learn", "More"); 

		// .entrySet() returns all the keys with their values present in Hashmap 
		Set<Map.Entry<String, String>> mappingGeeks = maps.entrySet(); 
		System.out.println("Set of Keys and Values using entrySet() : "+mappingGeeks); 
		System.out.println(); 

		// Using .getOrDefault to access value 
		// Here it is Showing Default value as key - "Code" was already present 
		System.out.println("Using .getorDefault : "
									+ maps.getOrDefault("Code","javaArticle")); 

		// Here it is Showing set value as key - "Search" was not present 
		System.out.println("Using .getorDefault : "
									+ maps.getOrDefault("Search","javaArticle")); 
		
		System.out.println(); 

		// .replace() method replacing value of key "Learn" 
		maps.replace("Learn", "Methods"); 
		System.out.println("working of .replace() : "+mappingGeeks); 
		System.out.println(); 

		/* .putIfAbsent() method is placing a new key-value 
			as they were not present initially*/
		maps.putIfAbsent("cool", "HashMap methods"); 
		System.out.println("working of .putIfAbsent() : "+mappingGeeks); 

		/* .putIfAbsent() method is not doing anything 
			as key-value were already present */
		maps .putIfAbsent("Code", "With_JAVA"); 
		System.out.println("working of .putIfAbsent() : "+mappingGeeks); 

	} 
} 
