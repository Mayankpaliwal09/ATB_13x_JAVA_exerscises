package Atb13x_Exerscises.ex_05_typeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //  Widening -> Implicit Casting
        System.out.println(a);

        byte c  = (byte)a;  // narrowing --> explicit casting
    }
}
