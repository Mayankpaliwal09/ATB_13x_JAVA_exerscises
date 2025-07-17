package Atb13x_Exerscises.ex_30_Exceptions;

public class Lab220_Handle_Exception {
    public static void main(String[] args) {
        int a = 0;
        try {
            int result = 100/0;  // java.lang.ArithmeticException
        } catch (Exception e){
            System.out.println("Div by zero not allowed");
        }
        System.out.println(a);

        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.
    }
}
