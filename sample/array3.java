package com.sample;
//finding max element
public class array3 {
    public static void main(String[] args) {
        int[] a={12,-6,55,99,11};
        int max=0,min=0;
        for(int i:a)
        {
            if(i>max)
            {
                max=i;
            }
        }
        System.out.println(max);
    }
}
