package assignment;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int no = sc.nextInt();
        for (int i=1;i<=10;i++) {
            System.out.print((no*i) + "\t");
        }
    }
}
