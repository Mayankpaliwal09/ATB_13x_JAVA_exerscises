package Tasks_java_ATX13.Tasks_24th_June;

import java.util.Scanner;

public class Withdraw_Simulation {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The amount to Withdraw :");
        if(sc.hasNextInt()){
            int balance = 10000;

            int withdraw = sc.nextInt();



            if(withdraw > balance ){
                System.out.println("transaction fail enter amount in limit");
            } else if (withdraw <= 0 ) {
                System.out.println("Amount should be greater than zero");
            } else if (withdraw%100==0) {
                    withdrawAmt(balance,withdraw);
            } else {
                System.out.println("Amount must be a multiple of 100");
            }

        }else {
            System.out.println("please Enter valid Amount");
        }
    }

    private static void withdrawAmt(int balance, int withdraw) {

        System.out.println("Money Withrawn");

        balance = balance-withdraw;

        System.out.println("Updated balance is :" +balance);

    }


}
