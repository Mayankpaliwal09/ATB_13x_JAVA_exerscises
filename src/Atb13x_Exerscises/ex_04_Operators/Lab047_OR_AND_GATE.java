package Atb13x_Exerscises.ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR

        System.out.println(true || true);  //t
        System.out.println(true || false);  //t
        System.out.println(false || true);  //t
        System.out.println(false || false); //f


        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
