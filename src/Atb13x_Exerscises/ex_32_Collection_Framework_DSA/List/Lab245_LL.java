package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.LinkedList;
import java.util.List;

public class Lab245_LL {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("lion");
        animals.add("zebra");
        animals.add("elephant");
        animals.add("elephant");
        animals.add("rhino");
        System.out.println("LinkedList: " + animals);

        // Accessing elements
        System.out.println("First Element :" + animals.get(0));
        System.out.println("Second Element :" + animals.get(1));

        // Removing elements
//        System.out.println(animals.remove());  // remove first element of list
        System.out.println(animals.removeFirst());
        System.out.println(animals.removeLast());

        System.out.println("LinkedList after removal: " + animals);


        System.out.println("Size of LinkedList: " + animals.size());

    }

}
