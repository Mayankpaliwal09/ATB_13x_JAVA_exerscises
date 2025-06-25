package Tasks_java_ATX13.Tasks_25th_June;

import java.util.Scanner;

public class Bonus_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter year of experience :");
        double experience = sc.nextDouble();

        double bonus ;
        double bonusGained ;
        double totalSalary;
        if(experience < 1){
            System.out.println("No bonus for you experience is low work hard !! ");
            System.out.println(salary + " sorry no bonus for you");
        } else if (experience >=1 && experience <= 3 ) {
            bonus = 5;
            System.out.println("congratulation you got 5% bonus");
            bonusGained =( salary * bonus) / 100;
             totalSalary = salary + bonusGained ;
//            System.out.println(bonusGained);
            System.out.println(totalSalary + " Salary after bonus");
        }else if (experience >=4 && experience <= 6 ) {
            bonus = 10;
            System.out.println("congratulation you got 10% bonus");
            bonusGained =( salary * bonus) / 100;
             totalSalary = salary + bonusGained ;
            System.out.println(totalSalary + " Salary after bonus");
        } else {
            bonus = 15;
            System.out.println("congratulation you got 15% bonus");
            bonusGained =( salary * bonus) / 100;
             totalSalary  = salary + bonusGained ;
            System.out.println(totalSalary + " Salary after bonus");
        }
    }
}
