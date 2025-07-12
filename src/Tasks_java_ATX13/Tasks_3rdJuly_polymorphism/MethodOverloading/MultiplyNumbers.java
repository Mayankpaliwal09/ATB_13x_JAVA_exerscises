package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverloading;

public class MultiplyNumbers {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
       int prod1 = m1.multiply(2,3);
       int prod2 = m1.multiply(4,5,5);

        System.out.println("Product of two is :"+prod1);
        System.out.println("Product of three is :"+prod2);
    }
}

class MathOperations{

    public int multiply(int a , int b){
        return a*b;
    }

    public int multiply(int a , int b, int c){
        return a*b*c;
    }
}
