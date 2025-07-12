package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverriding;

public class AnimalSounds {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Animal dog = new Dog();
        dog.sound();

        Animal c = new Cat();
        c.sound();

        Animal cow = new Cow();
        cow.sound();
    }
}

class Animal{

    void sound(){
        System.out.println("This is animal class sound method");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog Says Woof Woof !!");
    }
}

class Cat extends Animal{

    void sound(){
        System.out.println("Cat says Meow Meow !!");
    }
}

class Cow extends Animal{

    void sound(){
        System.out.println("Cow says Moo Moo !!");
    }
}
