package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverriding;

public class VehicleStart {
    public static void main(String[] args) {

        Vehicle c = new Car();
        c.start();

        Vehicle b = new Bike();
        b.start();
    }
}

class Vehicle{

    void start(){
        System.out.println("Vehicle is Started .");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Kick Start the bike");
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("Turn the key to start the car");
    }
}
