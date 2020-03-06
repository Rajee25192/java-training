package com.collections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CreateHashSetExample {
    public static void main(String[] args) {
    	
    	Set<String> asList = Arrays.asList(args).stream()
    			.collect(Collectors.toSet());
    	
    	System.out.println(asList);
    	
    	Set<String> forLoop = new LinkedHashSet<>();
    	Set<String> dup = new LinkedHashSet<>();
    	for(String s : args){
    		
    		if(!forLoop.add(s)){
    			dup.add(s);
    		}
    		forLoop.removeAll(dup);
    	}
    	System.out.println(forLoop);
    	System.out.println(dup);
        // Creating a HashSet
     Set<String> daysOfWeek = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        daysOfWeek.add(null);
        daysOfWeek.add(null);
        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");
        System.out.println(daysOfWeek);
    }
}