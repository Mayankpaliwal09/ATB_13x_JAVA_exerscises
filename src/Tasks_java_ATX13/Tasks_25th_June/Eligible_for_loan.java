package Tasks_java_ATX13.Tasks_25th_June;

import java.util.Scanner;

public class Eligible_for_loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you age :");
        int age = sc.nextInt();

        System.out.println("Enter you Salary :");
        double salary = sc.nextDouble();

        System.out.println("Enter you credit_score :");
        int creditScore = sc.nextInt();

        boolean isAgeValid =  age_validate_check(age);
        boolean isSalaryValid = salary_validate_check(salary);
        boolean isCreditScoreValid = credit_score_validate_check(creditScore);
        if (!isAgeValid) {
            System.out.println("Age is not valid. Must be between 18 and 80.");
        }

        if (!isSalaryValid) {
            System.out.println("Salary is not valid. Must be at least 30,000.");
        }

        if (!isCreditScoreValid) {
            System.out.println("Credit score is not valid. Must be between 650 and 850.");
        }

        if (isAgeValid && isSalaryValid && isCreditScoreValid) {
            System.out.println("✅ Person is eligible for a loan.");
        } else {
            System.out.println("❌ Person is NOT eligible for a loan.");
        }

        sc.close();
    }

    private static boolean age_validate_check(int age) {
//        boolean validated = false;
//        if(age >= 18 && age <= 80){
//
//            validated = true;
//        } else {
//            validated = false;
//        }
//        return validated;
        return age >= 18 && age <= 80;
    }

    private static boolean salary_validate_check(double salary) {
        return salary >= 30000;
    }

    private static boolean credit_score_validate_check(int creditScore) {
       return creditScore >= 650 && creditScore<=850;
    }

}
