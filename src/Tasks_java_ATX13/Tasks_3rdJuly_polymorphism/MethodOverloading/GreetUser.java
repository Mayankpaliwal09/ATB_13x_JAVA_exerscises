package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverloading;

public class GreetUser {
    public static void main(String[] args) {
        Greeter greet = new Greeter();
        greet.greet();
        greet.greet("Mayank");
    }
}

class Greeter{

    void greet(){
        System.out.println("Hello");
    }

    void greet(String name){
        System.out.println("Hello from : "+name);
    }


}
