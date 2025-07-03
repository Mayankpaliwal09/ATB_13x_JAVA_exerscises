package Atb13x_Exerscises.ex_17_OOPs;

public class Lab167_OOps_P2 {
    public static void main(String[] args) {

        Student s1 = new Student();
//        s1.sleep();

        Student s2 ;
        new Student();
    }


}

class  Student{

    String name;

    //This is called as the default constructor, same name as the class name.
    Student(){
        System.out.println("hi from default constructor");
    }


    // this is normal method
    void sleep(){
        System.out.println("hi i am another DC");
    }
}

class A{}
class b{}
