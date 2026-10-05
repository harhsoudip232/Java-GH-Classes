abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void calculateSalary();

    // Concrete method
    void work() {
        System.out.println(name + " is working.");
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println(name + "'s salary is ₹30,000.");
    }
}

class PartTimeEmployee extends Employee {

    PartTimeEmployee(String name) {
        super(name);
    }

    void calculateSalary() {
        System.out.println(name + "'s salary is ₹15,000.");
    }
}

public class AbstractClassExample {

    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee("Rahul");

        f.work();
        f.calculateSalary();

        PartTimeEmployee p = new PartTimeEmployee("Priya");

        p.work();
        p.calculateSalary();
    }
}
