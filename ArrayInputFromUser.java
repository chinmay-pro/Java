package com.company;

import java.util.Scanner;

public class ArrayInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int no = sc.nextInt();
        int [] arr = new int[no];
        for (int i=0;i<no;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array elements are : ");
        for (int i=0;i<no;i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
