package com.company;

import java.util.ArrayList;

public class Wildcard {
    public static void main(String[] args) {
        Integer[] integerArray = {2,5,4,1};
        Number[] numberArray = {2.5,7,8.9,1};
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for(Integer item : integerArray)
            integerArrayList.add(item);

        ArrayList<Number> numberArrayList = new ArrayList<Number>();

        for(Number item : numberArray)
            numberArrayList.add(item);
        System.out.println("Integer list : "+integerArrayList);
        System.out.println("Sum of the integer array : "+sum(integerArrayList));

        System.out.println("Integer list : "+numberArrayList);
        System.out.println("Sum of the integer array : "+sum(numberArrayList));
    }

    public static double sum(ArrayList<? extends Number> list)
    {
        double total =0;
        for(Number item : list)
            total = total + item.doubleValue();
        return total;
    }
}
