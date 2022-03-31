package com.company;

import java.util.ArrayList;

public class Totalnumber {
    public static void main(String[] args) {
        Number[] numbers = {1,3,4.5};
        ArrayList<Number> numberArrayList = new ArrayList<Number>();

        for(Number item : numbers)
        {
            numberArrayList.add(item);
        }

        System.out.println(numberArrayList);
        System.out.println("Total of the numbers is: ");
        System.out.println(sum(numberArrayList));
    }
    public static double sum(ArrayList<Number> list)
    {
        double total =0;
        for(Number item : list)
            total = total + item.doubleValue();
        return total;
    }


}
