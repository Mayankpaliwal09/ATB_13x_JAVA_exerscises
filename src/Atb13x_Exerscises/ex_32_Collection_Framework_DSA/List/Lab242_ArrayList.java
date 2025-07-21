package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add("mayank");
        l.add("mayank"); // Duplicate is allowed.
        l.add(13); // Different data type is allowed.
        l.add(null);  // null allowed
        System.out.println(l);
        System.out.println(l.getLast());


        ArrayList l2 = new ArrayList<>();
        l2.add("C");
        l2.add(111);
        l2.add(true);

        l.addAll(l2);
        System.out.println(l);


        List l3 = new ArrayList();   // Dynamic dispatch
        System.out.println(l3.isEmpty());


    }
}
