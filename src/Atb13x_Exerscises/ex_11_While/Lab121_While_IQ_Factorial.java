package Atb13x_Exerscises.ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial :");

        if(!sc.hasNextInt()){
            System.out.println("please enter valid number!!");
            return;
        }

        int number = sc.nextInt();
        long fact = 1;

        if(number<0){
            System.out.println("Negative number is not allowed");
        }

        if(number <= 0){
            System.out.println(fact);
        } else {
            for (int i = 1; i<=number; i++){
                fact=fact*i;

            }
        }
        System.out.println(fact);
    }
}
