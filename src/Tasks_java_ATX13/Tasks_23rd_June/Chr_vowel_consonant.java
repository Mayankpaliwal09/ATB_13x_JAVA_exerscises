package Tasks_java_ATX13.Tasks_23rd_June;

import java.util.Scanner;

public class Chr_vowel_consonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a chracter : ");
        String s = sc.next().toLowerCase();
        char ch = s.charAt(0);
        System.out.println(Character.isLetter(ch));  // return boolean if it is a vali dchracter

       if(Character.isLetter(ch)){
           if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
               System.out.println(ch +" is a vowel");
           } else {
               System.out.println(ch+" is a consonant");
           }
       } else {
           System.out.println("Enter a valid chracter between 'a-z' ");
       }
    }
}
