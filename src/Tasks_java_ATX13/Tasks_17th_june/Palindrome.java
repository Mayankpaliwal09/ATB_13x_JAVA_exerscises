package Tasks_java_ATX13.Tasks_17th_june;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String name = sc.next();
        int i = 0;
        int j = name.length()-1;
        boolean isPalindrome = true;
        while(i<j){
         if(name.charAt(i) != name.charAt(j)){
             isPalindrome = false;
             break;
         }
         i++;
         j--;
        }
       if (isPalindrome){
           System.out.println("String is palindrome");
       } else {
           System.out.println("String is not palindrome");
       }

    }
}
