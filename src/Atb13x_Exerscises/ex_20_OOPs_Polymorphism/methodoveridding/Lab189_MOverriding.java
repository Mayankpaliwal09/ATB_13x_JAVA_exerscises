package Atb13x_Exerscises.ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab189_MOverriding {
    public static void main(String[] args) {

//        Animal d = new Animal();
//        d.sound();

        Dog d1 = new Dog();
        d1.sound();


    }
}

class Animal{

    void sound(){
        System.out.println("default sound ---");
    }
}


class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("woof woof !!!");
    }

    void methodOverLoad(){

    }

    void methodOverLoad(int a){

    }
}
