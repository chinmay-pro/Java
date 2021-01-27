package Projects;

import java.util.Date;

public class Greetings {
    public static void main(String[] args) {
       Date date = new Date();
       int hours = date.getHours();
        if (hours >=1 && hours < 12){
            System.out.println("Hello sir, Good Morning");
        }
        else if (hours >=12 && hours < 18){
            System.out.println("Hello sir, Good Afternoon");
        } else if(hours>=18 && hours < 20){
            System.out.println("Hello sir, Good Evening");
        } else {
            System.out.println("Hello sir, Good Night");
        }
    }
}
