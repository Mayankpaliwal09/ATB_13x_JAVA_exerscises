package Test_2_string;

public class Prog_2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println("equals() : " + s1.equals(s2));
        System.out.println("equalignoreCase() : " + s1.equalsIgnoreCase(s2));
        System.out.println("compareTo() : " + s1.compareTo(s2));

        System.out.println(s1 == s2);
    }
}
