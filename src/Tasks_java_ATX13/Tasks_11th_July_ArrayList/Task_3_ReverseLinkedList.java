package Tasks_java_ATX13.Tasks_11th_July_ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Task_3_ReverseLinkedList {

    public static void main(String[] args) {
        List<Integer> nums = new LinkedList();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println("Reversed List:" );

        System.out.println(nums.reversed());


        System.out.println("Revese using loop");
        for(Integer num : nums.reversed()){
            System.out.print(num+" , ");
        }
        System.out.println();
        for(Integer num : nums){
            System.out.print(num+" , ");
        }
    }

}
