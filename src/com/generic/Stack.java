package com.generic;
class Stack<E> {
    private final int size;

    private int top;

    private E[] elements;

    public Stack() {
         this(10);
    }

    @SuppressWarnings("unchecked")
    public Stack(int s) {
        size = s > 0 ? s : 10;
        top = -1;
        elements = (E[]) new Object[size]; // create array
    }

    public void push(E pushValue) {
         if (top == size - 1) // if stack is full
            throw new FullStackException(String.format("Stack is full, cannot push %s", pushValue));

         elements[++top] = pushValue; // place pushValue on Stack
    }

    public E pop() {
         if (top == -1) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");

        return elements[top--]; // remove and return top element of Stack
    }
}