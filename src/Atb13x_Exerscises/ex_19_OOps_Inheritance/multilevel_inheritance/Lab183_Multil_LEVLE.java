package Atb13x_Exerscises.ex_19_OOps_Inheritance.multilevel_inheritance;

public class Lab183_Multil_LEVLE {
    public static void main(String[] args) {
        Son amit = new Son();
        // Son s1 = new Father();
        // Son s1 = new GrandFather();


//        Dynamic dispatch means:
//        Java decides at runtime which version of an overridden method to call — based on the actual object type, not the reference type.

        // During Dynamic dispatch You can only access methods that are defined in the parent (GrandFather) class or overridden in Son — unless you downcast the reference.
        GrandFather g1 = new Son();  // Dynamic Dispaatch
        g1.gfCar();


        GrandFather g2 = new Father();
        g2.gfHome();

        Father f2 = new Son();
        f2.Fhome();

        // WebDriver driver = new ChromeDriver();

        // Father f3 = new GrandFather();

    }
}
