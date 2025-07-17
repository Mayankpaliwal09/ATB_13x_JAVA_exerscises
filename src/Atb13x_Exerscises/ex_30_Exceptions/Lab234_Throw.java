package Atb13x_Exerscises.ex_30_Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab234_Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ;");
        int age = sc.nextInt();

        try {
           if( validateAge(age)){
               System.out.println("go to goa");
           }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static boolean validateAge(int age) throws ArithmeticException, FileNotFoundException{
        if(age<18){
            throw new ArithmeticException("you are minor, cnt go to goa");
        }else {
            return true;
        }

    }
}
