package Tasks_java_ATX13.Tasks_24th_June;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Check_Alphabet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//    String ch = String.valueOf(sc.next().charAt(0));
        System.out.println("Enter the Alphabet");
        String alphabet = sc.next();
        char ch = alphabet.charAt(0);

        IsAlphabet(ch);
    }

    private static void IsAlphabet(char ch) {

        if((ch >= 'A' && ch<= 'Z') || (ch >= 'a' && ch<= 'z')){
            System.out.println("It is a Alphabet");

        } else {
            System.out.println("Not A alphabet");
        }
    }

}
