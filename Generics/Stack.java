package com.company;

public class Stack <E>{
    private final int size;
    private int top;
    private E[] element;

    public Stack()
    {
        this(5);
    }
    public  Stack(int x)
    {
        if(x>0)
            size = x;
        else
            size = 5;
        top = -1;

        element = (E[]) new Object[size];
    }

    public void Push(E value)
    {
        if(top == size -1)
        {
            throw new StackFullException("Cannot Push element, The stack is full");
        }
        else
        {
            top++;
            element[top]=value;
        }
    }

    public E Pop()
    {
        if(top==-1)
        {
            throw new StackEmptyException();
        }
        else
        return element[top--];

    }
}
