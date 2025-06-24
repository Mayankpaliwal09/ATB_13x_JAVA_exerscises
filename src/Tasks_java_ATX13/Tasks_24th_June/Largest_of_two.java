package Tasks_java_ATX13.Tasks_24th_June;

import java.util.Scanner;

public class Largest_of_two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number :");
        int a =  sc.nextInt();
        System.out.println("Enter Second number :");
        int b = sc.nextInt();


        LargestofTwo(a,b);

    }

    public static void LargestofTwo(int a, int b){

        System.out.println("value of First no is : " +a);
        System.out.println("value of second no is : " +b);


        System.out.println();
        if (a>b){
            System.out.println("A is largest which is  " +a);
        } else {
            System.out.println("B is largest which is  " +b);
        }
    }
}
