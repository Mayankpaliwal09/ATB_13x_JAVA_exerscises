package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

public class Interface_with_def_static_method {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.start();
        Vehicle.fuelType();
    }
}

interface Vehicle{
    // Default method (non-static, has body)
   default void start(){
        System.out.println("vehicle started");
    }

    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle{

}