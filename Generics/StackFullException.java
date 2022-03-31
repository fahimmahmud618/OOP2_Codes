package com.company;

public class StackFullException extends RuntimeException{
    public StackFullException()
    {
        this("Stack is full, cannot insert");
    }
    public StackFullException(String Astring)
    {
        super(Astring);
    }
}
