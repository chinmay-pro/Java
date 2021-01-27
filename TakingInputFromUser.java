package com.company;
import java.util.Scanner;
public class TakingInputFromUser {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       // String a = sc.nextLine();
        System.out.println("Entered number is : " + a);
    }
}
