package com.generic;
// This class only accepts type parametes as any class
// which extends class A or class A itself.
// Passing any other type will cause compiler time error
public class BoundedGenericClass<T extends A> {
 private T t;

 public BoundedGenericClass(T t){
         this.t = t;
     }

 public void doRunTest() {
  this.t.displayClass();
 }

 public static void main(String[] args) {

  // Creating object of sub class C and
  // passing it to Bound as a type parameter.
	 BoundedGenericClass<C> bec = new BoundedGenericClass<C>(new C());
  bec.doRunTest();

  // Creating object of sub class B and
  // passing it to Bound as a type parameter.
  BoundedGenericClass<B> beb = new BoundedGenericClass<B>(new B());
  beb.doRunTest();

  // similarly passing super class A
  BoundedGenericClass<A> bea = new BoundedGenericClass<A>(new A());
  bea.doRunTest();

 }
}


class A {
 public void displayClass() {
  System.out.println("Inside super class A");
 }
}

class B extends A {
 public void displayClass() {
  System.out.println("Inside sub class B");
 }
}

class C extends A {
 public void displayClass() {
  System.out.println("Inside sub class C");
 }
}