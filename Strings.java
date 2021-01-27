package com.company;

public class Strings {

    public static void main(String[] args) {
        // Immutability - can't change string
        // Mutability - can change string

         // First Method
        String s = "Hello world";
        System.out.println(s);

        //Second Method
        char [] arr = {'i', 't', 'u'};
        String ch = new String(arr);
        System.out.println(ch);

        //Third method
        String [] string = {"Hello","World"};
        for (int i=0;i<string.length;i++) {
            System.out.println(string[i]);
        }
      //String length
      int len = s.length();
        System.out.println("Length of String s " + len);
          //Merging two strings
         String merge = "I am writing java";
         String m = " program";
        String k = merge.concat(m);
        System.out.println("After merging two strings: " + k );

        //Accessing string by index
        String in = "Chinmay";
        char access = in.charAt(0);
        System.out.println("At 0th index of String: " + access);

        System.out.println("Converting char to string : " + String.valueOf(arr));
    }
}
