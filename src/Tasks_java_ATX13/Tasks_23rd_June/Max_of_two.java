package Tasks_java_ATX13.Tasks_23rd_June;

import java.util.Scanner;

public class Max_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 =  sc.nextInt();
        System.out.println("Enter Second number :");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is max");
        } else if (num2>num1) {
            System.out.println(num2 + " is max");
        } else {
            System.out.println("both numbers are equal");
        }
    }
}
