package Atb13x_Exerscises.ex_20_OOPs_Polymorphism.methodoveridding;

public class Real_lifeExample {

    public static void main(String[] args) {
        Bank b = new FdAccount();
        System.out.println(b.calcIntrest());
    }
}

class Bank{
    double calcIntrest(){
        return 0.0;
    }
}


class SavingsAccount extends Bank{
    double calcIntrest(){
       return 5.0; // 5% intrest for savings
    }
}

class FdAccount extends Bank{
    double calcIntrest(){
        return 7.5; // 7.5% interest for fixed deposit
    }
}
