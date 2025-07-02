package Atb13x_Exerscises.ex_14_Strings;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next();

      String  string_reversed = reverseString(input);
        System.out.println(string_reversed);
        if(string_reversed.equalsIgnoreCase(input)){
            System.out.println("palindrome");
        } else {
            System.out.println("not palindromeee");
        }



        String  string_reversedSb = reverseStringSb(input);

        if(string_reversedSb.equalsIgnoreCase(input)){
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }




    private static String reverseString(String input) {
        String reversed="";

        for(int i = input.length()-1;i>=0;i--){
            reversed = reversed+ input.charAt(i);
        }

        return reversed;
    }

    private static String reverseStringSb(String input) {

        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();
    }
}






