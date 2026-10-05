interface Workable {

    void work();
}

abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    // Concrete method
    void displayName() {
        System.out.println("Employee: " + name);
    }

    // Abstract method
    abstract void calculateSalary();
}

class Developer extends Employee implements Workable {

    Developer(String name) {
        super(name);
    }

    // Implementing interface method
    public void work() {
        System.out.println(name + " is writing code.");
    }

    // Implementing abstract class method
    void calculateSalary() {
        System.out.println("Salary: ₹40,000");
    }
}

public class InterfaceAbstractExample {

    public static void main(String[] args) {

        Developer d = new Developer("Rahul");

        d.displayName();
        d.work();
        d.calculateSalary();
    }
}