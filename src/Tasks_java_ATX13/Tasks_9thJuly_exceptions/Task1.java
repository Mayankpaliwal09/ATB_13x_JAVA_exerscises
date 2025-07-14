package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        System.out.println("Starting");
        try{
            int c = a/b;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Cant divide by zero !!");
        }
        System.out.println("Ending");
    }
}
