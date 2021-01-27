package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParsingException {
    static void convertDateFormat(String inputDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date date = sdf.parse(inputDate);
            SimpleDateFormat outsdf = new SimpleDateFormat("yyyy-MM-dd");
            String outputDate = outsdf.format(date);
            System.out.println("After changing date format to yyyy/MM/dd : " + outputDate);
        }catch (ParseException e) {
            System.out.println("Some errors in converting date formats. Exception");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in dd/MM/yyyy format : ");
        String inputDate = sc.nextLine();
        convertDateFormat(inputDate);
    }
}
