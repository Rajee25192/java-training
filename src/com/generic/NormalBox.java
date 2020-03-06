package com.generic;
public class NormalBox {
    private Object object;

    public void set(Object object) {
         this.object = object;
    }

    public Object get() {
         return object;
    }

    public static void main(String[] args) {
         NormalBox type = new NormalBox();
         type.set("String");
         System.out.println(type.get());
  
         NormalBox type1 = new NormalBox();
         type1.set(100);
         System.out.println(type1.get());
  
         Integer integer = (Integer) type.get();
         System.out.println(integer);
    }
}