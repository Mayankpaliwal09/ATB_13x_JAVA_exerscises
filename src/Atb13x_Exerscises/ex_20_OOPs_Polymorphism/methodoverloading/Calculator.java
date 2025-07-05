package Atb13x_Exerscises.ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {

        Calc c1 = new Calc();
        c1.add(1,2);
        c1.add(3,4,5);
        c1.add(2.12,2.11);
    }
}

// Method overloading its a compile time polymorphism
// it decides which method is being called

class Calc{

    void add(int a , int b){
        System.out.println(a+b);
    }

    void add(int a, int b , int c){
        System.out.println(a+b+c);
    }

    double add(double a , double b){
        System.out.println(a+b);
        return a+b;
    }
}

