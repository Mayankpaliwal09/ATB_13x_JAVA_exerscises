package Atb13x_Exerscises.ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        pramod_f1();
        System.out.println( return_int());
        System.out.println(return_boolean());
        System.out.println(return_float_pi_value());
        System.out.println( return_long());
        System.out.println(  return_String());
    }
    static void pramod_f1(){
        System.out.println("No Return");
    }

    static int return_int(){
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }

    static long return_long(){
        return 10l;
    }

    static String return_String(){
        return "mayank";
    }
}
