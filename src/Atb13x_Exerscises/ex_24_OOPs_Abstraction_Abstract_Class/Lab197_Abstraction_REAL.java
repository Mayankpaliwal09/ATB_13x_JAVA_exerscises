package Atb13x_Exerscises.ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab197_Abstraction_REAL {
    public static void main(String[] args) {


        Company c1 = new Company("mayank","xyz",123456 );
        c1.mailCheck();
       double d =  c1.computePay();
        System.out.println(d);


    }
}


abstract class Employee{
    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address , int number){
        System.out.println("Constructing an employee :");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck(){
        System.out.println("Mailing a check to "+ this.name+" " + this.address);
    }
}

class Company extends Employee{
    @Override
    double computePay(){
        return 1000;
    }

    Company(String name , String address , int number){
        super(name , address, number);
        System.out.println("calling company constructor");
    }
}
