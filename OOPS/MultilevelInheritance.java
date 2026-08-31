package OOPS;

class Grandfather {

    void property() {
        System.out.println("Grandfather has property.");
    }
}

class Father extends Grandfather {

    void business() {
        System.out.println("Father runs a business.");
    }
}

class Son extends Father {

    void study() {
        System.out.println("Son is studying.");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Son s = new Son();

        s.property();   // From Grandfather
        s.business();   // From Father
        s.study();      // Son's own method
    }
}