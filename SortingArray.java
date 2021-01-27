package com.company;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
    public static void main(String[] args) {
        String[] arr = {"67","97","56"};
        for (String i: arr) {
            System.out.println(i);
        }
        System.out.println("Sorting of array");
        Arrays.sort(arr);
        for (String j: arr) {
            System.out.println(j);
        }
        Arrays.sort(arr, Collections.reverseOrder());
    }
}
