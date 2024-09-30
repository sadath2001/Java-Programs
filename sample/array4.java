package com.sample;
//finding max and min both in a single loop
public class array4 {
    public static void main(String[] args) {
        int[] a={12,11,-67,9,8};
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
        System.out.println(max+" "+min);
        for(int i:a)
        {
            if(i>max){
                max=i;
            }
            if(i<min)
            {
                min=i;
            }
        }
        System.out.println(max+" "+min);

    }
}
