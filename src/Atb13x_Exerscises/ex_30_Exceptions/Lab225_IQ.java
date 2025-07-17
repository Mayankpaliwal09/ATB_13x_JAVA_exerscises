package Atb13x_Exerscises.ex_30_Exceptions;

public class Lab225_IQ {
    public static void main(String[] args) {
        try {
            String inp_user = args[0]; // java.lang.ArrayIndexOutOfBoundsExceptio
            int b = Integer.parseInt(inp_user); // java.lang.NumberFormatException: For input string
            System.out.println(b);
            int result = 100/b;
            System.out.println(b);
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
