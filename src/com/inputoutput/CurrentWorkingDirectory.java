package com.inputoutput;
import java.nio.file.FileSystems;


public class CurrentWorkingDirectory {
 
 /**
  * getCurrentWorkingDirectoryPath
  * 
  * @return
  */
 public static String getCurrentWorkingDirectoryPath() {
  return FileSystems.getDefault().getPath("").toAbsolutePath().toString();
 }

 /**
  * getCurrentWorkingDirectoryPath
  * 
  * @return
  */
 public static String getCurrentWorkingDirectory() {
  return System.getProperty("user.dir");
 }
 
 public static void main(String[] args) {
  
  System.out.println(getCurrentWorkingDirectory());
  System.out.println(getCurrentWorkingDirectoryPath());
 }
}