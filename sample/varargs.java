package com.sample;

public class varargs {
    static int sample(int x,int ...arr)
    {
        int sum=x;
        for(int a:arr)
        {
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of numbers is: "+sample(1,2,3,4,5));
    }
}
