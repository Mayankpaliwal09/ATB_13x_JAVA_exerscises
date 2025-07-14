package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task5 {
    public static void main(String[] args){

        try{

            // null pointer exception
//            String s = null;
//            System.out.println(s.trim());


//             ArithmeticException example
             int result = 10 / 0;
             System.out.println(result);

        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e);

        }
    }
}
