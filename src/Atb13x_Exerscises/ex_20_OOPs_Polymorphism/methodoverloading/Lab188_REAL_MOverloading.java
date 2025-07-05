package Atb13x_Exerscises.ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab188_REAL_MOverloading {

    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task(88);
        h1.task("mayank");

        h1.task(true);
        h1.task(false);

    }
}

class Home{
    void task(){
        System.out.println("this is task 1");
    }

    int task(int a){
        System.out.println("this is task 2 ");
        return a;
    }

    String task(String s){
        System.out.println("This is task 3-->"+s);
        return s;
    }

    boolean task(boolean b){
        System.out.println("THis is boolean task --> "+b);
        return b;
    }
}
