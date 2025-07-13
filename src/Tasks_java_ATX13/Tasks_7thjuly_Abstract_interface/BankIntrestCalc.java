package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

public class BankIntrestCalc {
    public static void main(String[] args) {
        Bank b1 = new Sbi();
        b1.getIntrestRate();

        Bank b2 = new Hdfc();
        b2.getIntrestRate();

    }
}

abstract class Bank{
    abstract void getIntrestRate();
}

class Hdfc extends Bank{

    void getIntrestRate(){
        System.out.println("SBI intrest Rate : 6.5%");
    }
}

class Sbi extends Bank{
    void getIntrestRate(){
        System.out.println("HDFC intrest Rate : 7.0%");
    }
}
