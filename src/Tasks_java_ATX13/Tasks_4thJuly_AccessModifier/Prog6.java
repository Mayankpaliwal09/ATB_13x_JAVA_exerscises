package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;

public class Prog6 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.doEat();
    }
}

class Animal01{

    protected void eat(){
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal01{

    void doEat(){
        super.eat();
//        eat();
    }
}