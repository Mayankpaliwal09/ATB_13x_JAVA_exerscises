package Tasks_java_ATX13.Tasks_23rd_June;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num =  sc.nextInt();

        if(num%2 == 0){
            System.out.println(num+" is even");
        } else {
            System.out.println(num+" is odd");
        }
        sc.close();
    }
}
