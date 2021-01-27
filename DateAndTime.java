package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime d =  LocalDateTime.now();
        String Time = d.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String Date = d.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Welcome to Date Time Viewer : ");
        System.out.println("Today's Date is : - " + Date);
        System.out.println("Time is : - " + Time);
    }
}
