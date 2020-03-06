package com.inputoutput;
import java.io.File;


public class RenameFileExample {
 
 public static void main(String[] args) {
  renameFile();
 }

 // Renames the file denoted by this abstract pathname.
 public static void renameFile() {
  File file = new File("/Users/rajekuma/Documents/SpringReference/sample.txt");
  boolean hasRename = file.renameTo(new File("/Users/rajekuma/Documents/SpringReference/sample2.txt"));
  if (hasRename) {
   System.out.println("File rename successful");
  } else {
   System.out.println("File reanme failed");
  }
 }
}