class Payment {

    void pay() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();
    }
}