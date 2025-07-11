package Atb13x_Exerscises.ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {

        P p1 = new P();
        P p2 = new P();
        //        System.out.println(P.fun());
        System.out.println(P.a);
        System.out.println(p1.a);
        System.out.println(p2.a);
        // System.out.println(P.b);

        P.a = 101;
        System.out.println(P.a);

        p1.b = 11;
        System.out.println(p1.b);
        p2.b = 12;
        System.out.println(p2.b);

        p1.a = 1000;
        System.out.println(p1.a);
    }

}

class P{
    static int a = 100;
    int b = 10;

    void fun(){
        System.out.println("this is hi from a function");
    }
    static{
        // This is static block.
        // This is called whenever a class a loaded.
        System.out.println("hi from static block i will called when a class loaded");
        // The usage of static block is if you want to call some of the methods, \
        // like calling a database connection, calling an Excel collection
    }
}