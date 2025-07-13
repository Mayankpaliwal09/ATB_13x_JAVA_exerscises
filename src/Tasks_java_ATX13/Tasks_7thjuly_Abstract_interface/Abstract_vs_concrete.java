package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

import java.util.function.Predicate;

public class Abstract_vs_concrete {
    public static void main(String[] args) {

        Children c1 = new Children();
        c1.show();
        c1.display();

    }
}

abstract class Parent{

    // abstract method
    abstract void show();

    void display(){
        System.out.println("I am concrete method inside abstract class");
    }
}

class Children extends Parent{
    @Override
    void show(){
        System.out.println("This is abstract method inside child/subclass");
    }
}
