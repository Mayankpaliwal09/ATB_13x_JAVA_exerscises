package Atb13x_Exerscises.ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        Car c = new Car();
        c.getMax_speed();
        c.setMax_speed(100);
        c.getMax_speed();
        c.message();
        c.Display();

    }
}

class Vehicle {
    public int max_speed = 200;

    Vehicle(){
        System.out.println("default constructor");
    }

    Vehicle(int a){
        System.out.println("Param constructor");
        System.out.println("Param constructor"+a);
    }


    // Method Overloading - Same, same name function with different arguments.

    void message(){
        System.out.println("type 1");
    }

    void message(int a){
        System.out.println("type 2");
    }


    int message(String a){
        System.out.println("type 4");
        return 0;
    }

    void Display(){
        System.out.println("vehicle parent disaplay of base class vehicle");
    }

}


class Car extends Vehicle{
    private int max_speed = 180;

    public int getMax_speed() {
        System.out.println(max_speed);
        return max_speed;

    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    Car(){
        super();  //calling parent default constructor
    }

    Car(int a){
        super();// calling parent param constructor
    }

    @Override
    void Display(){
        System.out.println(super.max_speed);
        System.out.println(this.max_speed);
        super.Display();  // parent class display fucntion
        super.message();
        super.message(20);
    }
}



