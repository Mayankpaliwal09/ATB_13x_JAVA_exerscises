package Tasks_java_ATX13.Tasks_1stJuly_constructor;

public class Default_constructor {
    public static void main(String[] args) {
        Car d1 = new Car();
        System.out.println(d1.brand);

    }
}


class Car{

    String brand;
    Car(){
        System.out.println("This is a default constructor");
        brand="Tesla";
//        System.out.println(brand);

    }
}