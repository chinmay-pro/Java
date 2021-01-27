package OOPs.encapsulation;

public class Abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
        Jaguar j1 = new Jaguar();
        j1.start();
    }
}

class Audi extends Car {

    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class Jaguar extends Car {

    @Override
    void start() {
        System.out.println("Jaguar is Starting");
    }
}

abstract class Car {
    int price;
    abstract void start();
    void breaks() {
        System.out.println("Car is breaking");
    }
}
