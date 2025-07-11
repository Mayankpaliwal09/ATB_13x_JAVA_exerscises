package Atb13x_Exerscises.ex_27_Static;

public class Lab206_Static {
    public static void main(String[] args) {

        //Used to initialize static variables
        // Runs once, when the class is loaded into memory
        //  Runs before the main() method or any object is created
        // first static block will execute

        A ref1 = new A(10);
        A ref2 = new A(11);
        System.out.println(ref1.a);  // 11
        System.out.println(A.b);  // 20
        System.out.println(ref2.a); // 11

        System.out.println(ref1.b);  // 20
        System.out.println(ref2.b);  // 20

        ref1.display();
        ref2.display();

        A.staticMethod(); // Can be called without creating an object
    }
}

class A{


    int a ; //  non static - instance variable
    static int b = 20;  // static this is shared between - objects

    //PM constructot
    A(int a){
        this.a = a;
    }

    void display(){
        System.out.println(this.a);
        System.out.println(b);
    }

    // static method
    static void staticMethod(){
//        Can be called without creating an object
//        Can only access static data
//        Cannot use this or super


        System.out.println("I will be called when class is loaded");
//        System.out.println(this.a);// Methods cannot access non-static variables in a static function.
//        System.out.println(a);  // cannot access non-static variable from static block
    }


    static {

//        Used to initialize static variables
//        Runs once, when the class is loaded into memory
//        Runs before the main() method or any object is created


        System.out.println("this is static"); // this will call first of all
    }
}