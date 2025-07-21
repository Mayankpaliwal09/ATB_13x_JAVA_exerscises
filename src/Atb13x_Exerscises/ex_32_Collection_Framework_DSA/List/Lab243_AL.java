package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL {
    public static void main(String[] args) {

        List list = new ArrayList<>(10);
        list.add("2");  // 0
        list.add("3"); // 1
        list.add("3");  //2
        list.add(4);  //3
        list.add(true);  //4
        list.add("3"); // 5
        list.add("mayank"); //6

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("mayank"));

        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(list.indexOf("mayank"));
        System.out.println(list.lastIndexOf("3"));

        System.out.println(list);
        System.out.println(" -----------");

        System.out.println("Printing list using for loop");
        System.out.println(list.get(0));

        for(int i = 0; i< list.size(); i++){
            System.out.println("item on index "+i+"--> "+list.get(i));
        }


        // enhance  for  loop

        for(Object o : list){
            System.out.println(o);
        }

        list.set(1,25);
        System.out.println(list);

        list.remove(0);  // Remove element at index 0

        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
}
