package Atb13x_Exerscises.ex_24_OOPs_Abstraction_Abstract_Class;

public class Real_life_Abstraction {
    public static void main(String[] args) {
        Payment pay = new PayPalPayment();
        pay.processPayment(1000);

        System.out.println("-------");
        Payment p2 = new CreditCardPayments();
        p2.processPayment(2000);
    }
}


abstract class Payment{
    // Abstract method – must be implemented by subclasses
    abstract void processPayment(double amount);

    // concrete method - shared logic
    void printReceipt(double amount){
        System.out.println("payment od $"+amount+"completed");
    }
}

//processPayment() is abstract → it defines what should be done, but not how.
//printReceipt() is a shared method.

class CreditCardPayments extends Payment{
   @Override
    void processPayment(double amount){
       System.out.println("processing credit card payment");
       // Complex internal logic here (hidden from main code)
       System.out.println("charged $"+amount+"to credit card.");
    }
}

class PayPalPayment extends Payment{
    @Override
    void processPayment(double amount){
        System.out.println("processing paypal payment");
        // Complex internal logic here (hidden from main code)
        System.out.println("charged $"+amount+" via paypal.");
    }
}

