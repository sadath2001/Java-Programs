package com.sample;

public class fibonacci {
    static void fib(int n)
    {
        if(n==0)
        {
            System.out.println("0");
        }
        else if(n==1)
        {
            System.out.println("0 1");
        }
        else if(n>1){
            int first=0,second=1;
            int third;
            System.out.print(first+" "+second+" ");

            for (int i = 0; i < n-2; i++) {
                third=first+second;
                System.out.print(third+" ");
                first=second;
                second=third;;
            }
        }
        else{
            System.out.println("ENter a positive number please");
        }
    }
    public static void main(String[] args) {
        fib(4);
    }
}
