package Atb13x_Exerscises.ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab182_Multil_LEVLE {

    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gfHome();
        System.out.println(gf.gold_gf);
        gf.gfCar();


        System.out.println(" -- ");

        Father f1 = new Father();
        System.out.println("father have its own gold :" +f1.gold);
        System.out.println("father have gold of GF :" +f1.gold_gf);
        f1.Fhome();
        f1.Fcar();
        f1.gfCar();
        f1.gfHome();


        System.out.println(" -- ");

        Son s1 = new Son();
        // son can access father , gf and self home
        s1.home();
        s1.Fhome();
        s1.gfHome();

        s1.gfCar();
        s1.Fcar();
        s1.bike();

    }

}
