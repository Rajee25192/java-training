package com.inputoutput;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStreamExample {
 public static void main(String[] args) {
  try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees.txt"))) {
   final Employee employee = (Employee) in.readObject();
   System.out.println(" printing employee object details");
   System.out.println(employee.getId() + " " + employee.getName());

   System.out.println(" printing address object details");
  } catch (IOException | ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}