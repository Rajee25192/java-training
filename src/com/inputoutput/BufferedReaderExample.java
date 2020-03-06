package com.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
 public static void main(String[] args) {
  try (FileReader fr = new FileReader("/Users/rajekuma/Documents/SpringReference/sample.txt"); 
    BufferedReader br = new BufferedReader(fr);) {
   String i;
   while ((i = br.readLine()) != null) {
    System.out.print( i);
   }
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}