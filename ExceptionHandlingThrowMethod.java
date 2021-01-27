package com.company;

public class ExceptionHandlingThrowMethod {
    static void a () throws ArithmeticException {
        System.out.println("Inside a function");
        throw new ArithmeticException("Demo");
        /* try{
            throw new ArithmeticException("Demo");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } */
    }
    public static void main(String[] args) {
        try{
            a();
        } finally {
            System.out.println("Caught");
        }
    }
}
