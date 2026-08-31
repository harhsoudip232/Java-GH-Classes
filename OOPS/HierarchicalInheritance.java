package OOPS;

class Employee {

    void login() {
        System.out.println("Employee logged in.");
    }
}

class Developer extends Employee {

    void writeCode() {
        System.out.println("Developer is writing code.");
    }
}

class Manager extends Employee {

    void conductMeeting() {
        System.out.println("Manager is conducting a meeting.");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.login();
        d.writeCode();

        Manager m = new Manager();

        m.login();
        m.conductMeeting();
    }
}