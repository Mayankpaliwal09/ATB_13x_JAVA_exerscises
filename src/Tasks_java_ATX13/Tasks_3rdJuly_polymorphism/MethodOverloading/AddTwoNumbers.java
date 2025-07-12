package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverloading;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.addTwo(2,3);
        c1.addTwo(4.0,3.01);
    }
}

class Calculator{

    void addTwo(int a , int b){
//        System.out.println(a+b);
        System.out.println("Addition of two Integer :"+ (a+b));
    }

    void addTwo(double a, double b){
//        System.out.println(a+b);
        System.out.println("Addition of two Double :"+(a+b));
    }
}
