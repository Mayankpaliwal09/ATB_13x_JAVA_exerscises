package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {
    public static void main(String[] args) {

        List l1 = new ArrayList(5);
        List l2 = new ArrayList(); // // Arrays Format - Continuous


        // linked list

        List l3 = new LinkedList(); // Doubly Linked List.

        l3.add("mayank");
        l3.add(1);
        l3.add(null);
        l3.add(null);
        l3.add(true);
        l3.add("mayank");
        l3.add("Sonal");
        l3.add("Paliwal");
        System.out.println(l3);

        System.out.println(l3.isEmpty());
        System.out.println(l3.size());
        System.out.println(l3.contains("Dutta"));
        System.out.println(l3.indexOf("Dutta"));
        System.out.println(l3.get(0));

        System.out.println(" --- ");

        // Iterator

        Iterator iterator = l3.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }

    }
}
