package com.generic;
public class GenericBox<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericBox<String> type = new GenericBox<>();
        type.set("String");
        
        GenericBox<Integer> type1 = new GenericBox<>();
        type1.set(100);
  
        System.out.println(type1.get());
        System.out.println(type.get());
       /*Integer integer = (Integer) type.get(); // compiler error
        System.out.println(integer);*/
    }
}