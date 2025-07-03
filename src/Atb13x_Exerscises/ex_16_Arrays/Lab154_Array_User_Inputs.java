package Atb13x_Exerscises.ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();

        int [] arr = new int[size];
//        System.out.println(arr);

        // input value in array

        for (int i = 0 ; i<arr.length; i++){
            System.out.println("Enter element at index:"+i);
            arr[i] = sc.nextInt();
        }

        System.out.println(" ---- Below Code is printing the elements! ");

        for (int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+",");

        }
    }
}
