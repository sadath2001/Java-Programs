package com.sample;

public class multiplication {
    static void mult(int n)
    {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d",n,i,n*i);
            System.out.println();
                   }
    }

    public static void main(String[] args) {
        mult(10);
    }
}
