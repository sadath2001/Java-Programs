package com.sample;

public class recursion_factorial {
    static int sample(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * sample(n - 1);

        }
    }

    public static void main(String[] args) {
        System.out.println(sample(5));
        int n = 5;
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        System.out.println("Factorial is: " + result);
    }
}
