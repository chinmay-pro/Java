package com.company;

//import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args)  {
    /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide a number by Zero");
        }
        try {
            int num = Integer.parseInt("chinmay");
            System.out.println(num);
        }
        catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        try {
            int [] a = new int[4];
            a[7] = 9;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have chosen non existing index in array");
        }
          try {
              try {
                  int num = Integer.parseInt("Chinmay");
                  System.out.println(num);
              } catch (NumberFormatException e) {
                  System.out.println("Number format exception");
              } try {
                  int [] a = new int[5];
                  a[7] = 67;
              }catch (Exception e) {
                  System.out.println("Handled");
              }
              System.out.println("Other Statement");
          } catch (Exception e) {
              System.out.println("Handled and recovered");
          }
            try {
                int num = Integer.parseInt("Chinmay");
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("Number format exception");
            }catch (Exception e) {
                System.out.println("Handled");
            }
            System.out.println("Other Statement"); */
        try {
            int num = Integer.parseInt("Chinmay");
            System.out.println(num);
        } finally {
            System.out.println("Other Statement");
        }

    }
}
