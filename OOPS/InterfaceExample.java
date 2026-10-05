interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

class Lori implements Vehicle {

    public void start() {
        System.out.println("Lori bhaiya played bhojpuri music.");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Car c = new Car();
        c.start();

        Bike b = new Bike();
        b.start();

        Lori l = new Lori();
        l.start();
    }
}