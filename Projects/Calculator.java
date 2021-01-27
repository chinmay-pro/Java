package Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Calculator\n");
        System.out.println("Signs for calculator : Addition = +, Subtraction = -, Multiplication = * ");
        System.out.println("Want do division yes either no do other stuff. Available options : Addition, Multiplication, Subtraction : ");
        String w = sc.next();
        if (w.equals("y")) {
            System.out.println("Enter two numbers");
            float f1 = sc.nextFloat();
            float f2 = sc.nextFloat();
            float fans = f1 / f2;
            System.out.print("Division is : " + fans);
        }else {
            System.out.println("Enter first number : ");
            int firstNum = sc.nextInt();
            System.out.println("Enter the operator : ");
            op = sc.next();
            System.out.println("Enter the second number : ");
            int secondNum = sc.nextInt();
            switch (op) {
                case "+" -> System.out.print("Addition is : " + (firstNum + secondNum));
                case "-" -> System.out.print("Subtraction is : " + (firstNum - secondNum));
                case "*" -> System.out.print("Multiplication is : " + (firstNum * secondNum));
            }
        }
    }
}
