package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

import Atb13x_Exerscises.EX_01_Java_Basics._mayank_mayank;

public class Abs_with_const {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMessage();

    }
}

abstract class AbstractClass{
//constructor
    AbstractClass(){
        System.out.println("Abstract class constructor called");
    }

    //method / Non-abstract method
    void showMessage(){
        System.out.println("Method from abstract class");
    }

}

class Child extends AbstractClass{

}

