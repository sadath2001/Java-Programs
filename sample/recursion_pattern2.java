package com.sample;

 class recursion_pattern2 {
    static void rec(int n)
    {
        if(n>0)
        {
            rec(n-1);
            for (int i = 0; i <n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rec(4);
    }
}
