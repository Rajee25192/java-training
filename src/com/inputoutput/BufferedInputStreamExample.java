package com.inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
 public static void main(String[] args) {
  try( FileInputStream fin=new FileInputStream("/Users/rajekuma/Documents/SpringReference/sample.txt");    
       BufferedInputStream bin=new BufferedInputStream(fin); ){
   int i;    
      while((i=bin.read())!=-1){    
       System.out.print((char)i);    
      }    
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}