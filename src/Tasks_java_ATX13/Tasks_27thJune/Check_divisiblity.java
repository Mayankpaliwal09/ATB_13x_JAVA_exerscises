package Tasks_java_ATX13.Tasks_27thJune;

import java.util.Scanner;

public class Check_divisiblity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Check if a Number is Divisible by 5 and 11");
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        //   System.out.println(num);

        if(num%5 == 0 && num%11==0){
            System.out.println(num+ " is divisible by 5 and 11");
        } else {
            System.out.println(num+" is not divisible by 5 and 11");
        }
    }
}
