package com.company;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException()
    {
        this("Stack is full, cannot insert");
    }
    public StackEmptyException(String Astring)
    {
        super(Astring);
    }
}
