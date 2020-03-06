package com.inputoutput;
import java.io.File;


public class DeleteFileExample {
 
 public static void main(String[] args) {
  deleteFile();
 }
 public static void deleteFile() {
  File file = new File("/Users/rajekuma/Documents/SpringReference/sample2.txt");
  if (file.delete()) {
System.out.println(file.getName() + "created !!");
  } else {
   System.out.println("Delete operation failed");
  }
 }
}