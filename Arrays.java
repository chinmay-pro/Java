package com.company;

public class Arrays {
    public static void main(String[] args) {
         // 1D
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        // MULTI DIMENSION - 2D
        int [] [] j;
        j = new int[][]{{20,10,40},{54,897,9}};
        for (int k = 0;k<j.length;k++) {
            for(int t=0;t<j[k].length;t++) {
                System.out.print(j[k][t] + "\t");
            }
        }
    }
}