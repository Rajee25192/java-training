package com.inputoutput;
import java.io.FileReader;
import java.io.IOException;


class FileReaderDemo {
 public static void main(String args[]) {
  try (FileReader fr = new FileReader("/Users/rajekuma/Documents/SpringReference/sample.txt")) {
   int c;
   // Read and display the file.
   while ((c = fr.read()) != -1)
    System.out.print((char) c);
  } catch (IOException e) {
   System.out.println("I/O Error: " + e);
  }
 }
}