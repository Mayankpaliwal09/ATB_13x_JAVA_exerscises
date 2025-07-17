package Atb13x_Exerscises.ex_30_Exceptions;

public class Lab224_Try_IQ {
    public static void main(String[] args) {
        String s = null;

        try {
            System.out.println(s.length());

        }catch (NullPointerException e){
            System.out.println("Null or arth exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
