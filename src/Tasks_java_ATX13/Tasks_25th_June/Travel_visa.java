package Tasks_java_ATX13.Tasks_25th_June;

import java.util.Scanner;

public class Travel_visa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your visa status (valid / Invalid)");
        String visa = sc.next().toLowerCase();
        boolean visaValid ;

        if(visa.equals("valid")){
            visaValid = true;
            if(age >= 18 && visaValid == true){
                System.out.println("you visa is valid you can travel");
            } else {
                System.out.println("you visa is Invalid or age you cannot travel");
            }
        } else {
            System.out.println("your visa is Invalid");
        }



    }
}
