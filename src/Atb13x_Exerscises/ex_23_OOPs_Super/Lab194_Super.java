package Atb13x_Exerscises.ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Animal c = new Animal();

        c.gold();
        c.sound();
        System.out.println(c.gold);
        Animal c2 = new Animal(1,2);

    }
}

class God{
    int gold = 100;

    // method
    void sound(){
        System.out.println("God make a sound");
    }

    //constructor
    God(){
        System.out.println("THis is god default constructor");
    }

}

class Animal extends God{

    void sound(){
        super.sound();
    }

    Animal(){
        super();
    }

    Animal(int a , int b){
        System.out.println(a+b);
    }

    void gold(){
        System.out.println(super.gold);
    }
}
