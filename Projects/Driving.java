package Projects;

import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if (age > 18 && age < 100){
            System.out.println("You can drive");
        } else if(age == 18){
            System.out.println("We will decide");
        }else{
            System.out.println("You can't drive, Don't Be over smart");
        }
    }
}
