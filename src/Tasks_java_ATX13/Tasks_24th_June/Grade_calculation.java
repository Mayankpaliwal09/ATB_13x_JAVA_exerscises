package Tasks_java_ATX13.Tasks_24th_June;

import java.util.Scanner;

public class Grade_calculation {
    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks :");
        if(sc.hasNextInt()){
            int marks = sc.nextInt();
            if(marks >= 0 && marks <= 100){
                CalculateGrade(marks);
            } else {
                System.out.println("please enter marks in between 0-100");
            }
        } else {
            System.out.println("Please enter the valid marks");
            return;
        }



    }

    private static void CalculateGrade(int marks) {

        if(marks >= 90){
            System.out.println("Grade is  : +A");
        } else if (marks >= 80 ) {
            System.out.println("Grade is  : A");
        } else if (marks >= 70 ) {
            System.out.println("Grade is  : B");
        } else if (marks >= 60 ) {
            System.out.println("Grade is  : C");
        } else if (marks >= 50 ) {
            System.out.println("Grade is  : D");
        } else if (marks >= 50 ) {
            System.out.println("Grade is  : E");
        } else {
            System.out.println("You are fail ");
        }
    }
}
