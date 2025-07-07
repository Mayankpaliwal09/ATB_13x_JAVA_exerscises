package Atb13x_Exerscises.ex_22_OOPs_accessModifer.police;

public class Jrcop {
    public static void main(String[] args) {

        // here cop can access becouse they are in same package
        Cop jrcop = new Cop(5);
        jrcop.canIshoot();
        jrcop.thisDefaultF1();
    }
}
