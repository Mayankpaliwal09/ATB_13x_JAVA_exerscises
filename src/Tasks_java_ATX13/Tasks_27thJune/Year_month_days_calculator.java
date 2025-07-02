package Tasks_java_ATX13.Tasks_27thJune;

import java.util.Scanner;

public class Year_month_days_calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int year = num/365;
        int daysleft = num%365;

        // month
        int month = daysleft/30;
        int days = daysleft%30;


        System.out.println(year+" year" +","+ month +" month" +","+days+" days") ;


    }
}
