package Atb13x_Exerscises.ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]+",");
        }

        System.out.println();
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
        // You find it without using the sort function.
    }
}
