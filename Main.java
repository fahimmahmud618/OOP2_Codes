package com.company;

public class Main {
    public static <E> void print(E[] inputArray)
    {
        for(E item:inputArray)
            System.out.println(item);
    }
    public static void main(String[] args) {
        Integer [] intarray ={1,3,6,8,2};
        Character [] chararray ={'w','r','d','2'};
        Double[] doublearray = {1.5,2.7,5.4,6.7};
        System.out.println("\nPrinting Integer Array\n");
        print(intarray);

        System.out.println("\nPrinting Character Array\n");
        print(chararray);

        System.out.println("\nPrinting Double Array\n");
        print(doublearray);
    }
}
