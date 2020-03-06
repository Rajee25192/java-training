package com.collections;
// Java program to illustrate working of EnumSet and 
// its functions. 
import java.util.EnumSet; 
	
enum Gfg 
{ 
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ 
}; 
public class ENumExample 
{ 
	public static void main(String[] args) 
	{ 
		// Creating a set 
		EnumSet<Gfg> set1, set2, set3, set4; 

		// Adding elements 
		set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE, 
						Gfg.LEARN, Gfg.CODE); 
		set2 = EnumSet.complementOf(set1); 
		set3 = EnumSet.allOf(Gfg.class); 
		set4 = EnumSet.range(Gfg.CODE, Gfg.CONTRIBUTE); 
		System.out.println("Set 1: " + set1); 
		System.out.println("Set 2: " + set2); 
		System.out.println("Set 3: " + set3); 
		System.out.println("Set 4: " + set4); 
	} 
} 
