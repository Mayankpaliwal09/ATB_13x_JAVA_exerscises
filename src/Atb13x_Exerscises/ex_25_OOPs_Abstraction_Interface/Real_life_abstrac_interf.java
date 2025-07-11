package Atb13x_Exerscises.ex_25_OOPs_Abstraction_Interface;

public class Real_life_abstrac_interf {
    public static void main(String[] args) {
        Tv tv1 = new Tv("Samsung");

        tv1.diagnose();    // from abstract class
        tv1.turnOn();      // from interface
        tv1.turnOff();     // from interface
    }
}

interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class ElectronicDevice {
    String deviceName;

    ElectronicDevice(String name) {
        this.deviceName = name;
    }

    void diagnose() {
        System.out.println(deviceName + " is running diagnostics...");
    }
}

//Concrete Class: TV
class Tv extends ElectronicDevice implements RemoteControl {

    Tv(String name) {
        super(name);
    }

    public void turnOn() {
        System.out.println(deviceName + " TV is turning on...");
    }

    public void turnOff() {
        System.out.println(deviceName + " TV is turning off...");
    }


}