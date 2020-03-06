package com.inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class FileOutputStreamExample {
 
 public static void main(String[] args) {
  File file = new File("/Users/rajekuma/Documents/SpringReference/demo.txt");
  String content = "This is javA Rtraining";

  try (OutputStream fop = new FileOutputStream(file)) {

   // if file doesn't exists, then create it
   if (!file.exists()) {
    file.createNewFile();
   }
   // get the content in bytes
   byte[] contentInBytes = content.getBytes();

 //  fop.write(contentInBytes);
   fop.write(contentInBytes, 4, 5);
   System.out.println("Done");

  } catch (IOException e) {
  }
 }
}