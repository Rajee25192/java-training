package com.inputoutput;
import java.io.File;
import java.io.IOException;

public class CreateFileExample {
 public static void main(String[] args) {
  createFile();
 }
 
 public static void createFile() {
  File file = new File("newsample.txt");
  try {
   if (file.createNewFile()) {
   System.out.println("File is created !!");
   } else {
	   System.out.println("File is already exist");
   }
  } catch (IOException e) {
	  System.out.println();
	  e.printStackTrace();
  }
 }
}