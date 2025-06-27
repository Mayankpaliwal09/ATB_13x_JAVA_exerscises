package Tasks_java_ATX13.Tasks_27thJune;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();

       for(int i = 1; i < n ; i++){

           // space
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }

           // print pattern
           for(int k = 1; k<=(2*i-1); k++){
               System.out.print("*");
           }

           System.out.println();
       }

    }
}
