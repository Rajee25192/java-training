package com.inputoutput;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamExample {

 public static void main(String[] args) {
  final Employee employee = new Employee();
  employee.setId(100);
  employee.setName("ramesh");
         try (final FileOutputStream fout = new FileOutputStream("employees.txt");
   final ObjectOutputStream out = new ObjectOutputStream(fout)) {
   out.writeObject(employee);
   //out.writeInt(12345);
   //out.writeObject("Today");
   //out.writeObject(new Date());
        System.out.println(employee.toString());
   out.flush();
   System.out.println("success");
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}

class Employee implements Serializable {
 private static final long serialVersionUID = 1L;
 private int id;
 private String name;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}

 
}