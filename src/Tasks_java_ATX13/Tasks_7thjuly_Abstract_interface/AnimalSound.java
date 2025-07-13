package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

public class AnimalSound {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound();


        Animal c = new Cat();
        c.makeSound();
    }

}

abstract class Animal{

    abstract void makeSound();
}

class Dog extends Animal{

    void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows");
    }
}
