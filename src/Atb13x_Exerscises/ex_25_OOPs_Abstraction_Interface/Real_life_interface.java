package Atb13x_Exerscises.ex_25_OOPs_Abstraction_Interface;

//Imagine you have different types of devices –
// a TV, AC, and Fan – and they can all be controlled with a Remote Control.
//
//These devices are different, but they all support the same actions:
// turnOn(), turnOff(), and maybe changeChannel() (TV only).
// So instead of duplicating that structure in every device class,
// we define a common interface.



public class Real_life_interface {
    public static void main(String[] args) {

        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();

        AC ac = new AC();
        ac.turnOn();
        ac.turnOff();

        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();
    }
}


interface RemoteControls {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("Turning on the TV...");
    }

    public void turnOff() {
        System.out.println("Turning off the TV...");
    }

    public void changeChannel() {
        System.out.println("Changing the TV channel...");
    }
}


class Fan implements RemoteControl {
    public void turnOn() {
        System.out.println("Fan is spinning...");
    }

    public void turnOff() {
        System.out.println("Fan stopped.");
    }
}


class AC implements RemoteControl {
    public void turnOn() {
        System.out.println("AC is cooling the room...");
    }

    public void turnOff() {
        System.out.println("AC is turned off.");
    }
}