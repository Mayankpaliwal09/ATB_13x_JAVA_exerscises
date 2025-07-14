package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task4 {
    public static void main(String[] args) {
        int a = 10 ;
        int [] arr = {1,2};

        try{
            System.out.println("Outer try block executed ");
            try{
                System.out.println("Inner try block executing");
                System.out.println("trying to access element"+arr[1]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index of bound error caught in inner catch");
                System.out.println(e.getMessage());
            }

            int c = a/arr[1];
            System.out.println("result"+c);
        } catch (ArithmeticException e) {
            System.out.println("Arithemetic Exception occurs in outer catch block");
            System.out.println("Message"+e.getMessage());
        }

    }
}
