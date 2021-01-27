package Assignment2;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String ch = sc.nextLine();
        int len = ch.length();
        System.out.print("Length of " + ch + " is : " + len);
    }
}
