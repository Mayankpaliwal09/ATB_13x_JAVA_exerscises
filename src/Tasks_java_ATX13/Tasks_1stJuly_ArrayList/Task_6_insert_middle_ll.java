package Tasks_java_ATX13.Tasks_1stJuly_ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Task_6_insert_middle_ll {
    public static void main(String[] args) {
        List fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);

        fruits.add(1,"Orange");
        System.out.println("Fruits List: " + fruits);
    }
}
