package Tasks_java_ATX13.Tasks_25th_June;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Units consumed : ");
        int units = sc.nextInt();
        double rate ;

        if( units <= 100){
            rate = units*0.50;
        } else if (units <= 200) {
            rate = (100*0.5)+((units-100)*0.75);
        }else if ( units <= 300) {
            rate = (100*0.5)+(100*0.75)+((units-200)*1.20);
        } else {
            rate = (100*0.5)+(100*0.75)+(100*1.20)+((units-300)*1.50);
        }

        System.out.println("Your electricity bill is : " +rate);

        sc.close();
    }
}
