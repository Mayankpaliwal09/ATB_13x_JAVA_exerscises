package Tasks_java_ATX13.Tasks_23rd_June;

import java.util.Scanner;

public class Eligible_to_vote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age < 18){
            System.out.println("Not Eligible to vote 🚫");
        } else {
            System.out.println("Eligible to vote ✔ ");
        }


        sc.close();
    }
}
