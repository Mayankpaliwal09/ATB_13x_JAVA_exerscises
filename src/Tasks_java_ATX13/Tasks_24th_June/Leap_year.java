package Tasks_java_ATX13.Tasks_24th_June;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = sc.nextInt();

        CheckLeapYear(year);
        sc.close();
    }


    private static void CheckLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " is a Not leap year");
        }

    }
}
