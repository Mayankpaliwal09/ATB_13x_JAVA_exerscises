package Tasks_java_ATX13.Tasks_2ndJuly_inheritance;

public class Vehicle_constr_chain {
    public static void main(String[] args) {

        Bike b1 = new Bike();
    }
}

class Vehicle{

    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{

    Bike(){
        System.out.println("Bike is ready");
    }
}
