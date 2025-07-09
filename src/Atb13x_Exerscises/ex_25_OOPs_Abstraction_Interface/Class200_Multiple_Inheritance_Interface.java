package Atb13x_Exerscises.ex_25_OOPs_Abstraction_Interface;


public class Class200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        Son s = new Son();
        s.money();
    }
}

interface Father1{
    void money();
}

interface Father2{
    void money();
}

class Son implements Father1,Father2{
    @Override
    public void money(){
        System.out.println("child should earn own money");
    }
}