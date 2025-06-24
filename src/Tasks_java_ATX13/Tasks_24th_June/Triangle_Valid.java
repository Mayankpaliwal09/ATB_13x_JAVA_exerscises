package Tasks_java_ATX13.Tasks_24th_June;

import java.util.Scanner;

public class Triangle_Valid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First side :");
        int a = sc.nextInt();
        System.out.println("Enter second side :");
        int b = sc.nextInt();
        System.out.println("Enter Third side :");
        int c = sc.nextInt();


        if(a+b>c && b+c>a && c+a>b){
            System.out.println("It is a valid triangle");
        }
        else {
            System.out.println("It is NOT a valid triangle.");
        }

        sc.close();
    }
}
