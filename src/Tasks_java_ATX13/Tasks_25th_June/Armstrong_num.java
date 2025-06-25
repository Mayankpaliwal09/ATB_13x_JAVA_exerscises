package Tasks_java_ATX13.Tasks_25th_June;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int copy_num = num ;
        int sum = 0 ;

        int digit_count = String.valueOf(num).length();
        while (copy_num>0){

            int single_dig = copy_num % 10;
            sum += (int) Math.pow(single_dig , digit_count);
            copy_num = copy_num /10;

        }

        if(num == sum){
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }

        sc.close();
    }
}
