package Atb13x_Exerscises.ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        child c = new child();
        c.loan50k();
        c.loan25k();

    }
}


class Car{
  // This is concrete class
    // it Doesnt have the abstract methods

    void done(){

    }
}


abstract class Father{
    // this is called the abstract function
    abstract void loan50k();

    // a complete function in abstract class // non abstract function
    void loan25k(){
        System.out.println("given the 25k loan");
    }
}

class child extends Father{

    @Override
    void loan50k(){
        System.out.println("this is a abstract class method of 50k loan");
        System.out.println("son has to give 50k loan");
    }
}
