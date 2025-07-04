package Atb13x_Exerscises.ex_18_OOPs_Constructor;

public class Lab179_PC_Constructor_Overloading {

    public static void main(String[] args) {
        Person1 p1 = new Person1("RAMAN",97654321,"abc");
        Person1 p2 = new Person1("MAYANK",98989898,"XYZ");

        System.out.println(p1.name);
        System.out.println(p2.name);

        Person1 p3 = new Person1("sonal", 1233243);
        System.out.println(p3.name);

        p1.eat();
        p2.eat();
        p3.eat();

    }
}


class Person1{

    String name;
    long phone;
    String address;

    //DC
    Person1(){

    }

// PC
Person1(String name_arg,long phone_arg, String address_arg){
    this.name = name_arg;
    this.address = address_arg;
    this.phone = phone_arg;

}

// constructor overloading [constructor with same name]
    Person1(String name_arg,long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;
        System.out.println("I am with 2 parameters");
    }


    void eat(){
        System.out.println(this.name + " is eating!");
    }
}