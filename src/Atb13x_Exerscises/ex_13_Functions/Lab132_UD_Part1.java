package Atb13x_Exerscises.ex_13_Functions;

public class Lab132_UD_Part1 {
    // User Defined Functions.

    // 1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type

    public static void main(String[] args) {
        // 1.Without Argument / Parameters and Without Return Type.
        func_type1();

        System.out.println("------------------------------");

        // 2.Without Parameters but With Return Type
        String s = func_type2();
        System.out.println(s);

        System.out.println("------------------------------");


        // 3.With Parameters and Without Return Type
        func_type3(1,2);


        System.out.println("------------------------------");

        // 4. With Parameters and With Return Type
      int sumofTwo=  func_type4(1,10);
        System.out.println(sumofTwo);
    }



    // 1.Without Argument / Parameters and Without Return Type.
    public static void func_type1(){
        System.out.println("this is type 1 function withour parameter or without return type");
    }

    // 2.Without Parameters but With Return Type
    private static String func_type2() {
        System.out.println("Type 2 : Without Parameters but With Return Type -- ");
        return "how are you hi from type 2";
    }


    // 3.With Parameters and Without Return Type
    private static void func_type3(int i, int i1) {
        System.out.println("This is type 3 with parameters and without return type ");
        System.out.println(i+i1);
    }


    //  4. With Parameters and With Return Type
    private static int func_type4(int i, int i1) {
        System.out.println("This is type 4 with parameters and with return type ");
      int sum = i+i1;
        return sum;
    }

}
