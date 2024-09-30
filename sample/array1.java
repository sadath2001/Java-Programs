package com.sample;

public class array1 {
    public static void main(String[] args) {
     int[][] a={{1,2,3},
             {4,5,6}};
        int[][] b={{1,2,3},
                {4,5,6}};
        int[][] c={{0,0,0},{0,0,0}};
     int sum=0;
     for(int i=0;i<a.length;i++)
     {
         for (int k = 0; k < a[i].length; k++) {
             c[i][k]+=a[i][k]+b[i][k];
             System.out.print(c[i][k]+" ");

         }
         System.out.println();
     }

    }

}
