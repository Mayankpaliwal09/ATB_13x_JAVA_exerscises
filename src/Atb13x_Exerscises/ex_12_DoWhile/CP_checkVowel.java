package Atb13x_Exerscises.ex_12_DoWhile;

import java.util.Scanner;

public class CP_checkVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a','e','i','o','u'-> System.out.println("vowel");
            default -> System.out.println("consonant");
        }


    }
}
