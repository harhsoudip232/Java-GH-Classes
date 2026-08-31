package OOPS;

class Vehicle {

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();   // Inherited method
        c.drive();   // Car's own method
    }
}