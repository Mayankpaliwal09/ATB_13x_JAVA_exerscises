package Tasks_java_ATX13.Tasks_25th_June;

import java.util.Scanner;

public class Number_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int orignal = sc.nextInt();
        int num = orignal;
         int rev = 0;

         while(num>0){
             int digit = num % 10;
             rev = rev * 10 + digit;
             num = num / 10 ;
         }

         if(orignal == rev){
             System.out.println("palindrome");
         } else {
             System.out.println("Not palindrome");
         }

         sc.close();
    }
}
