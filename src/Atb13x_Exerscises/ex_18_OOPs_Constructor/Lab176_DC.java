package Atb13x_Exerscises.ex_18_OOPs_Constructor;

public class Lab176_DC {

    public static void main(String[] args) {

        // creating object

        car  c1 = new car();
        car  c2 = new car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println(c2.name);
        c2.name = "audi";
        System.out.println(c2.name);


        Baby1 b1 = new Baby1();
//        b1.name = "Nivisha";
        System.out.println(b1.name);
    }
}

class car{
    String name;
    int year;
    String model;


    // Default constructor
    car(){
       name= "Unknown" ;
       year=1991;
       model = "2000";
    }
}


class Baby1{
    String name;

    Baby1(){
        name = "Manku";
    }
}
