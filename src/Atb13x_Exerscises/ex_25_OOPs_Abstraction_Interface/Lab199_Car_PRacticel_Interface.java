package Atb13x_Exerscises.ex_25_OOPs_Abstraction_Interface;

public class Lab199_Car_PRacticel_Interface {
    public static void main(String[] args) {

        Car1 c = new Car1();
        c.drive();
    }
}


interface Brakes{
    void applyBrake();

}

interface Engine{
    void startEngine();
    void stopEngine();

    default void completeF1(){
        System.out.println("Default complete function!");
    }
}



class Car1 implements Engine,Brakes{

    void drive(){
        startEngine();
        applyBrake();
        stopEngine();
    }


    @Override
    public void startEngine(){
        System.out.println("Engine Started !!");
    }


    @Override
    public void applyBrake(){
        System.out.println("brake Applied");
    }


    @Override
    public void stopEngine(){
        System.out.println("Engine Stopped!!");
    }

}


