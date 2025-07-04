package Atb13x_Exerscises.ex_18_OOPs_Constructor;

public class Lab177_PC {
    public static void main(String[] args) {

        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
//        System.out.println(b1.name);
//        System.out.println(b2.name);


        // calling parametrized constructor

        BabyA b3 = new BabyA("mayank",1,2000);
        System.out.println(b3.name);
        System.out.println(b3.age);
        System.out.println(b3.year);
    }
}

class BabyA{

    String name;
    int age;
    int year;

    // DC
    BabyA(){
        name="UnKnown";
        age=0;
        year=0;

//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(year);
    }


    // Parametrized constructor
    // lets say we have updation form

    BabyA(String name, int age, int year ){

        // here java will confuse
        //Java is confused — it doesn't know you're trying to assign to the object's variable.
        name=name;
        age=age;
        year=year;

        // so we use This keyword
// Correct: 'this' refers to the current object’s instance variables
        this.name = name;
        this.age=age;
        this.year=year;
    }
}
