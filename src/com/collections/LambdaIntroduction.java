package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaIntroduction {
 
  public static void main (String[] ar){
          Employee[] employees  = {
              new Employee("David"),
              new Employee("Naveen"),
              new Employee("Alex"),
              new Employee("Richard")};
            
          System.out.println("Before Sorting Names: "+Arrays.toString(employees));
          Arrays.sort(employees, Employee::nameCompare);
          System.out.println("After Sorting Names "+Arrays.toString(employees));
          
          List<String> strings = Arrays.asList("how", "1", "do", "in", "java", "sorting", "example");
        	 
        	List<String> sorted = strings
        	        .stream()
        	        .sorted((s1, s2) -> s1.compareTo(s2))
        	        .collect(Collectors.toList());
        	 
        	System.out.println(sorted);
        	 
        	List<String> sortedAlt = strings
        	        .stream()
        	        .sorted(String::compareTo)
        	        .collect(Collectors.toList());
        	 
        	System.out.println(sortedAlt);
      }
}
  
class Employee {
  String name;
  
  Employee(String name) {
    this.name = name;
  }
  
  public static int nameCompare(Employee a1, Employee a2) {
    return a1.name.compareTo(a2.name);
  }
    
  public String toString() {
    return name;
  }
}