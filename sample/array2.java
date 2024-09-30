package com.sample;

public class array2 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6}};
        int[] b={12,34,77};
        int temp=0;
        for (int i = 0; i < b.length/2; i++) {
            temp=b[i];
            b[i]=b[b.length-1-i];
            b[b.length-i-1]=temp;

        }
        for(int k:b )
        {
            System.out.println(k);
        }
        System.out.println(7/2);
    }
}
