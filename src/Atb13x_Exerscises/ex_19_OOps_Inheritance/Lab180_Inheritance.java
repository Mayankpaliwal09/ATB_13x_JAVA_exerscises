package Atb13x_Exerscises.ex_19_OOps_Inheritance;

public class Lab180_Inheritance {

    public static void main(String[] args) {

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();


        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk1();
        s1.bhk2();

    }
}


class Father{
    int gold_f = 1000;// Attribute | Data variables |  Property | Instance Variables

    void bhk2(){
        System.out.println("This is father 2BHK");
    }
}

class Son extends Father{

    // Son inherits prop of father
//    int gold_f = 1000;// Attribute | Data variables |  Property | Instance Variables
//
//    void bhk2(){
//        System.out.println("This is father 2BHK");
//    }

    void bhk1(){
        System.out.println("This is son 1BHK");
    }
}
