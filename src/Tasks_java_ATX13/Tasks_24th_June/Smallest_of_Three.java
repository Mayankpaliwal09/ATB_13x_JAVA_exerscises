package Tasks_java_ATX13.Tasks_24th_June;

import java.util.Scanner;

public class Smallest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a =  sc.nextInt();
        System.out.println("Enter Second number :");
        int b = sc.nextInt();
        System.out.println("Enter Third number :");
        int c = sc.nextInt();

        Smallest_number_find(a,b,c);

    }

    public  static void Smallest_number_find(int a , int b , int c){

        if(a<b && a<c){
            System.out.println("A is the smallest number ");
        } else if (b<a && b<c) {
            System.out.println("B is smallest number");
        } else {
            System.out.println("C is the smallest");
        }
    }
}
