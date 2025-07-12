package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;

public class Prog1 {
    public static void main(String[] args) {
        Animal c1 = new Cat();

    }
}

class Animal{

    int a = 10;
    Animal(){
        System.out.println("This is a DC");
        System.out.println("Hi from animal");
    }
}

class Cat extends Animal{

    Cat(){
        super();
        System.out.println(super.a);
    }
}