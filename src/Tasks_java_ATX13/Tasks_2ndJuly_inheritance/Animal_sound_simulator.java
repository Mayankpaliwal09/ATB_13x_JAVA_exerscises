package Tasks_java_ATX13.Tasks_2ndJuly_inheritance;

public class Animal_sound_simulator {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.makeSound();
        c1.meow();


    }

}

class Animal{

    void makeSound(){
        System.out.println("This is animal class");
    }

}

class Cat extends Animal{

    void meow(){
        System.out.println("Cat says meow meow !!");
    }
}
