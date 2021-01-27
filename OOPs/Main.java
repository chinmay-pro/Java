package OOPs;

import OOPs.encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person(8,"Mihir Kulthe");
//        p1.name = "Chinmay Kulthe";
//        p1.age = 13;
       // System.out.println(p1.name + " " + p1.age);
       // System.out.println(p2.name + " " + p2.age);
//        p1.talk();
//        p1.sleep();
//        p2.sleep(6);
//        System.out.println(Person.count);
//          Dev myDev = new Dev(35,"Pallavi Kulthe");
//          myDev.talk();
        Encapsulation myObj = new Encapsulation();
//        myObj.doWork();
    }
}

class Dev extends Person {
    public Dev(int age,String name) {
        super(age, name);
    }

    void talk() {
        System.out.println("Developer " + name + " is talking.");
    }
}

class Person {
    protected String name;
    int age;
    static int count;
    public Person() {
        count++;
        System.out.println("Creating Object...");
    }
    public Person(int age, String name) {
        this();
        this.name = name;
        this.age = age;
    }
    void talk() {
        System.out.println(name + " is talking.");
    }
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
    void sleep(int hours) {
        System.out.println(name + " slept for " + hours + " hours.");
    }
}