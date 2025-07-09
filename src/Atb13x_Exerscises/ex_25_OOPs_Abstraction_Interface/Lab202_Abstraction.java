package Atb13x_Exerscises.ex_25_OOPs_Abstraction_Interface;

public class Lab202_Abstraction {
    public static void main(String[] args) {

    }
}

abstract class Incomplete_abstract{
    int a = 10;

    Incomplete_abstract(){

    }


    abstract void display();
    void display2(){
        a = 25;
        System.out.println("print");
    }
}

interface Incomplete_Interface{
    //    Incomplete_Interface(){
//        Interface never have a constructor.
//    }

    int a = 10; // final / public / and static in nature
    void display();

    default void display2(){
        //a = 12;  // complile time error cannot change in interface
        System.out.println("Default is allowed!");
    }

    static void display3(){
        System.out.println("Default is allowed!");
    }
}

//
//Feature	                     Abstract Class	                 Interface
//Can have constructor	            ✅ Yes	                      ❌ No
//Can have concrete methods	        ✅ Yes	                      ✅ Yes (default, static)
//Can have instance variables	    ✅ Yes	                      ❌ No (only public static final)
//Can inherit multiple	            ❌ No (only one superclass)	  ✅ Yes (multiple interfaces)
//Can be partially implemented	    ✅ Yes	                      ❌ No (unless using default)