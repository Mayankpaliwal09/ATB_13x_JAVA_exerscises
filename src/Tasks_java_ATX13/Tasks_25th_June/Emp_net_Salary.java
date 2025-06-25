package Tasks_java_ATX13.Tasks_25th_June;

import java.util.Scanner;

public class Emp_net_Salary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic pay :");
        double basicpay  = sc.nextDouble();
             if(basicpay < 0) {
                 System.out.println("salary must be greater than 0");
                 return;
             }

             double hra = calculateHra(basicpay);
             double da = calculateDa(basicpay);
             double grossSalary = basicpay + hra + da;
            System.out.println("your gross sal is  :" +grossSalary);

//            TAX DEDUCTION PF , PROFESSIONAL TAX , TDS

            double pf = calculatePf(basicpay);
            double professionalTax = 200;
            double tds = calculateTds(grossSalary);

            double totalDeduction = pf + professionalTax +tds;

            double netSalary = grossSalary - totalDeduction;

            printSalarySlip(basicpay , hra ,da , professionalTax , tds , pf, grossSalary ,totalDeduction, netSalary);
            sc.close();



    }

    private static void printSalarySlip(double basicpay, double hra, double da, double professionalTax, double tds, double pf ,double grossSalary , double totalDeductions , double netSalary) {
        System.out.println("---------- SALARY SLIP ----------");
        System.out.printf("Basic pay       : ₹%.2f\n" , basicpay);
        System.out.printf("HRA(40%%)        : ₹%.2f\n" , hra);
        System.out.printf("DA (10%%)        : ₹%.2f\n" , da);
        System.out.println("-------------------------------");
        System.out.printf("Gross Salary        : ₹%.2f\n", grossSalary);
        System.out.println();

        System.out.printf("PF (12%% of Basic)   : ₹%.2f\n", pf);
        System.out.printf("Professional Tax    : ₹%.2f\n", professionalTax);
        System.out.printf("TDS (10%% Gross)     : ₹%.2f\n", tds);
        System.out.println("----------------------------------");
        System.out.printf("Total Deductions    : ₹%.2f\n", totalDeductions);
        System.out.println("----------------------------------");
        System.out.printf("✅ Net Salary        : ₹%.2f\n", netSalary);
    }

    private static double calculateTds(double grossSalary) {
        return 0.10*grossSalary;
    }

    private static double calculatePf(double basicpay) {
        return 0.12*basicpay;
    }

    private static double calculateDa(double basicpay) {
        return 0.40*basicpay;
    }

    private static double calculateHra(double basicpay) {
    return 0.10*basicpay;
    }
}
