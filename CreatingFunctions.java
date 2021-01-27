package com.company;

import java.util.Scanner;

public class CreatingFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no = sc.nextInt();
        evenOdd(no);
    }
    static void evenOdd(int no) {
        if (no%2==0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
