package Tasks_java_ATX13.Tasks_23rd_June;

import java.util.Scanner;

public class smallest_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a =  sc.nextInt();
        System.out.println("Enter Second number :");
        int b = sc.nextInt();


        Smallest_number_find(a,b);

    }

    public  static void Smallest_number_find(int a , int b ){

       if(a<b){
           System.out.println(a+ " is smallest");
       } else {
           System.out.println(b+ " is smallest");
       }
    }
}
