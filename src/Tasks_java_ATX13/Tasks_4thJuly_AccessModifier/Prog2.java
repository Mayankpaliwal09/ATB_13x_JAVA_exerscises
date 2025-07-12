package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;

public class Prog2 {
    public static void main(String[] args) {
        LordAlto v1 = new LordAlto();
         v1.call();
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}

class LordAlto extends Vehicle{

    void call(){
        super.start();
    }
}
