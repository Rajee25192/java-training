package com.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
 
public class ArrayListVectorExample {
    public static void main(String[] args)
    {
        //Vector
        Vector<String> vector = new Vector<>(Arrays.asList("A","B","C"));
         
        Enumeration<String> vectorEnums = vector.elements();
         
        while(vectorEnums.hasMoreElements()) {
            String value = vectorEnums.nextElement();
            if("B".equals(value)) {
                vector.add("D");
            }
            System.out.println(value);
        }
         
        System.out.println("================");
                 
        //ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
         
        
        List<String> lists = Collections.synchronizedList(new ArrayList<String>());
        
        lists.add("abc");
        lists.add("fakjhfd");
        Iterator<String> listItr = lists.iterator();
         
        while(listItr.hasNext()) {
            String value = listItr.next();
            if("B".equals(value)) {
                list.add("D");
            }
            System.out.println(value);
        }
    }
}