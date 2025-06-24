package Tasks_java_ATX13.Tasks_23rd_June;

import java.util.Scanner;

public class Largest_of_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first number :");
        int a =  sc.nextInt();
        System.out.println("Enter Second number :");
        int b = sc.nextInt();
        System.out.println("Enter Third number :");
        int c = sc.nextInt();


        LargestofThree(a,b,c);

    }

    public static void LargestofThree(int a, int b, int c){
//
//        System.out.println("value of First no is : " +a);
//        System.out.println("value of second no is : " +b);
//        System.out.println("value of third no is : " +b);


        System.out.println();
        if (a>b && a>c){
            System.out.println(a +" is largest");
        } else if (b>c && b>a) {
            System.out.println(b+ " is the largest");
        } else {
            System.out.println(c+ " is the largest");
        }
    }
}
