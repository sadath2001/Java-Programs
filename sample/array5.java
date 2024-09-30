package com.sample;

public class array5 {
    public static void main(String[] args) {
        boolean flag=true;
        int[] a={12,55,99};
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]>a[i+1])
            {
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("is sorted");
        }
        else{
            System.out.println("Nope");
        }
        int q=10;
        int b=12;
        int c;
        System.out.println(c=q+b);
    }
}
