package com.company;

public class StackTest_Generics {
    private Integer[] integeritem ={1,4,3,2,6,7};

    private Stack <Integer> integerStack;
    public void teststack()
    {
        integerStack = new Stack <Integer> (6);
        PushTest("integeritem",integerStack,integeritem);
        PopTest("IntergerItem",integerStack);

    }

    public <E> void PushTest(String name, Stack<E> stack, E[] items)
    {
        try
        {
            System.out.printf("Pushing elements onto stack %s\n",name);

            for( E item : items )
            {
                System.out.println(item);
                stack.Push(item);
            }
        }
        catch(StackFullException stackFullException)
        {
            System.out.println();
            stackFullException.printStackTrace();
        }
    }

    public <E> void PopTest(String name, Stack<E> stack)
    {
        try
        {
            System.out.printf("Poping elements from stack %s",name);
            E popValue;

            while(true)
            {
                popValue = stack.Pop();
                System.out.printf("%s",popValue);
            }
        }catch (StackEmptyException stackEmptyException)
        {
            System.out.println();
            stackEmptyException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StackTest_Generics a = new StackTest_Generics();
        a.teststack();
    }
}
