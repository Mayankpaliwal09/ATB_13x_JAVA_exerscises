package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;

        try {

            int b= Integer.parseInt(args[3]);
            int c = a/b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("cant deivide by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }


    }
}
