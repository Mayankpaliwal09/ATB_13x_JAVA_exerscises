package Tasks_java_ATX13.Tasks_23rd_June;

import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num =  sc.nextInt();

        if(num < 0){
            System.out.println(num+" is negative");
        } else {
            System.out.println(num+" is positive");
        }
        sc.close();
    }
}
