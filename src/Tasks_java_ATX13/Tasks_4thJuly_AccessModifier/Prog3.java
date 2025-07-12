package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;

public class Prog3 {

    public static void main(String[] args) {
        Audi v1 = new Audi();
        v1.speed();
    }
}

class Vehicle2{

    int maxSpeed = 180;

    void carRunning(){
        System.out.println("Car is running at speed of :" +maxSpeed);
    }
}

class Audi extends Vehicle2{
//  int speed = super.maxSpeed;
    void speed(){
        System.out.println(super.maxSpeed);
    }
}
