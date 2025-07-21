package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_Use_Input_AL {
    public static void main(String[] args) {
        // Multiple inputs from the user and store them in separate
        // names, ages - store them

        ArrayList <String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String continueInput = "Y"; // Control variable for input loop

        while (continueInput.equalsIgnoreCase("y")){

            // names
            System.out.println("Enter the name : ");
            String  name = sc.next();
            names.add(name);

            // age
            System.out.println("Enter age : ");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record : if yes type [Y] else [N] : ");
            continueInput = sc.nextLine();



            // print using enhance loop

            for(String s : names){
                System.out.println(s);
            }


            // Print for age

            for(Integer a : ages){
                System.out.println(a);
            }

            sc.close();

        }
    }
}
