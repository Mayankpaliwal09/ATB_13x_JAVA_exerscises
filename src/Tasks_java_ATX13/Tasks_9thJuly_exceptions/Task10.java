package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task10 {
    public static void main(String[] args) {
//        Task 10: Try With Multiple Statements?

        try{

             int a = 10;
             int result = a/0;
            System.out.println(a);

            String s = null;
            System.out.println(s.trim());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
