package Atb13x_Exerscises.ex_27_Static;

public class Lab208_REAL {
}

class ATB{

    static {
        System.out.println("This is a static block");
    }

    {
        System.out.println("this is Instance intialization block");
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }
    private  String name;

    public String getPhone(){
        return phone;
    }

    public void setPhone(String ph){
        this.phone = ph;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


   public String phone;

    static String courseName = "ATB";
    static String mentorName ="Promod Dutta";

    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("do assignment");
//        System.out.println(courseName); // static variable can be accessible by static method
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyAssignment(){
        System.out.println("It is different!");
    }
}
