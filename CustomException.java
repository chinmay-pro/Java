package com.company;

import java.util.Scanner;

public class CustomException {
    static void validateInput(int number) throws InvalidInputException{
        if (number>100) {
            throw new InvalidInputException("Exception");
        }
        System.out.println("Valid Input");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number less than 100 : ");
        int number = sc.nextInt();
        try {
            validateInput(number);
        }catch (InvalidInputException e) {
            System.out.println("Entered number is greater than 100");
        }
    }
}
class InvalidInputException extends Exception
{
    InvalidInputException(String exceptionText){
        super(exceptionText);
    }
}
