package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

public class Task8 {

    public static void main(String[] args)  {
        int a = 10;
        int b = 9;
        try{
           if(b==0){
               throw new ArithmeticException("Dividing by 0 not allowed");
           }
           int result = a/b;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
