package OOPS;

//create class
class Student {

    //data
    String name;
    int roll;

    //method
    void display() {
        System.out.println(name);
        System.out.println(roll);
    }
}

public class OOPsExample {
    public static void main(String[] args) {

        //Object Create
        Student s1 = new Student();

        //initialization
        s1.name = "Soudip";
        s1.roll = 1;

        //Access method 
        s1.display();
    }
}
