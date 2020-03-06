package com.exceptional;
// Java program illustrating stack overflow error 
// by doing infinite recursion 

class StackOverflow { 
	public static void test(int i) 
	{ 
		// No correct as base condition leads to 
		// non-stop recursion. 
		if (i == 0) 
			return; 
		else { 
			test(i++); 
		} 
	} 
} 
public class ErrorEg { 

	public static void main(String[] args) 
	{ 

		// eg of StackOverflowError 
		StackOverflow.test(1); 
	} 
} 
