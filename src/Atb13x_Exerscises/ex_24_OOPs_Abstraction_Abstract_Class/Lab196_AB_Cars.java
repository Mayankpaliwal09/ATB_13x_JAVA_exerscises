package Atb13x_Exerscises.ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {
    public static void main(String[] args) {

        WagonR car1 = new WagonR();
          car1.drive();
          car1.startEngine();
    }
}


abstract class Engine {

    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine(){
        System.out.println("Everything is good");
    }
}


class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Engine Started");
    }

    @Override
    void stopEngine() {
        System.out.println("Engine Stopped");
    }

   void drive(){
        checkEngine();
        startEngine();
        stopEngine();
   }
}

