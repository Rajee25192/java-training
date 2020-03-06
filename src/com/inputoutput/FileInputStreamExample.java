package com.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
 public static void main(String[] args) {
  File file = new File("/Users/rajekuma/Documents/SpringReference/sample.txt");
  try (FileInputStream fis = new FileInputStream(file)) {
   int content;
   while ((content = fis.read()) != -1) {
    // convert to char and display it
    System.out.print((char) content);
   }
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}