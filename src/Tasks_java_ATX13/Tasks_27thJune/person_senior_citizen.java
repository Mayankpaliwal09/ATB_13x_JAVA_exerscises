package Tasks_java_ATX13.Tasks_27thJune;

import java.util.Scanner;

public class person_senior_citizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");


        if(!sc.hasNextInt()){
            System.out.println("please enter valid age ");
        } else {
            int age = sc.nextInt();
            if(age < 0 ){
                System.out.println("age cannot be in negative");
            } else if (age<= 12) {
                System.out.println("Your are in child category");
            } else if(age<=19){
                System.out.println("Your are in teenager category");
            }else if(age<=64){
                System.out.println("Your are in Adult category");
            }else if(age >= 65){
                System.out.println("Your are senior citizen");
            }
        }

    }
}
