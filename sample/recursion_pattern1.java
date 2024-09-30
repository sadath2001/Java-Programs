package com.sample;

public class recursion_pattern1 {
    static void pat(int n)
    {
        if(n>0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pat(n - 1);
        }
    }

    public static void main(String[] args) {
        pat(4);
    }
}
