package Atb13x_Exerscises.ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {

        temp_sum(2,3);
        temp_sum(3.45,4.23);
        temp_sum("mayank","paliwal");
    }


    private static int temp_sum(int a, int b) {
        return a+b;
    }

    private static Double temp_sum(double a, double b) {
    return a+b;
    }

    static String temp_sum(String s1 , String s2){
       return s1+s2;
    }
}
