package com.generic;
class EmptyStackException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmptyStackException() {
         this("Stack is empty");
    }

    public EmptyStackException(String exception) {
         super(exception);
    }
}

class FullStackException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public FullStackException() {
         this("Stack is full");
    }

    public FullStackException(String exception) {
         super(exception);
    }
}