package OOPs.encapsulation;

public class Interfaces implements MyCar, Person {
    public static void main(String[] args) {

    }

    @Override
    public void start() {
        System.out.println("my car is starting");
    }

    @Override
    public void walk() {
        System.out.println("Person is walking");
    }
}

interface MyCar {
    void start();
}

interface Person {
    void walk();
}