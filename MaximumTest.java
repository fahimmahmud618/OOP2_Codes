package com.company;

public class MaximumTest {
    public static <T extends Comparable <T>> T maximum(T x, T y, T z)
    {
        T max = x;

        if(y.compareTo(max)>0)
            max = y;
        if(z.compareTo(max)>0)
            max = z;
        return  max;
    }

    public static Comparable maximum2(Comparable x, Comparable y, Comparable z)
    {
        Comparable max =x;

        if(y.compareTo(max)>0)
            max = y;
        if(z.compareTo(max)>0)
            max = z;
        return  max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of 1,8,3 is: "+maximum(1,8,3));

        System.out.println("Maximum of a,h,r is: "+maximum2('a','h','r'));

    }
}
