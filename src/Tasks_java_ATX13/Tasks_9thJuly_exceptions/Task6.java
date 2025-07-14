package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task6 {
    public static void main(String[] args) {
        try {

//             null pointer exception
            String s = null;
            System.out.println(s.trim());


        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("Generic exception caught ->"+e);

        }


        try {

//             null pointer exception
            String s = null;
            System.out.println(s.length());


        } catch (NullPointerException e) {
//            throw new RuntimeException(e);
            System.out.println("Specific exception caught -> "+e);

        }
    }
}