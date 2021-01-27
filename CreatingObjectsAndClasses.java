package com.company;

import java.util.Scanner;

class Add {
    int a,b,c;
}
public class CreatingObjectsAndClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Add add = new Add();
        System.out.println("Enter the number:  ");
       add.a = sc.nextInt();
       add.b = sc.nextInt();
       add.c = add.a + add.b;
        System.out.println("Addition is: " + add.c );
    }
}
