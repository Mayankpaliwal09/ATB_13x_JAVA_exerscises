package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task9 {
    public static void main(String[] args) {


        try{
            System.out.println("Inside try block (no exception).");
            String s = "mayank";
            System.out.println(s);
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println("no exception there");
        }finally {
            System.out.println("I am finally block");
        }
    }
}
