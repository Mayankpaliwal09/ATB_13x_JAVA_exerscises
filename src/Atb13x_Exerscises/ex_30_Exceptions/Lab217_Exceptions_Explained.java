package Atb13x_Exerscises.ex_30_Exceptions;

public class Lab217_Exceptions_Explained {
    public static void main(String[] args) {
        System.out.println("Starting the program");
        String input_user = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        Integer a = Integer.parseInt(input_user); // java.lang.NumberFormatException
        Integer result = 100/0; // java.lang.ArithmeticException: / by zero
        System.out.println(result);
        System.out.println("End of the program");

        // divide by zero -> ?

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "pramod"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
    }
}
