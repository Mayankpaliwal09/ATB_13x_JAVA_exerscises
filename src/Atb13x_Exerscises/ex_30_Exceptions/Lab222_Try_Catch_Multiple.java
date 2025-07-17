package Atb13x_Exerscises.ex_30_Exceptions;

public class Lab222_Try_Catch_Multiple {
    public static void main(String[] args) {

        System.out.println("1");
        try{
            int a = 10/2; // can have arithemetic exception
            System.out.println(a);
            String s = null;
            System.out.println(s.trim());
        } catch (ArithmeticException e){
            System.out.println("Are you fool");
        } catch (Exception e){
            System.out.println("Are you fool too");
        }
        System.out.println("2");
    }
}
