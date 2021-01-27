package com.company;

public class Loops {
    public static void main(String[] args) {
        //for
        for (int i=1;i<=10;i++) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");
        //while
        int i=1;
        while (i<=5) {
            System.out.print(i + "\t");
            i++;
        }
        //do while
        int d = 10;
        System.out.println("\n");
        do {
            System.out.print(d + "\t");
            d--;
        }while (d>0);
        System.out.println("\n");
        //foreach
        int [] arr = {1,2,3,47,598};
        for (int j:arr) {
            System.out.print(j + "\t");
        }
    }
}
