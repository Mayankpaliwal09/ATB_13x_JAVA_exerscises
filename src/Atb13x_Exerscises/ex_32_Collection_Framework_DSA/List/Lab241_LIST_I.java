package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab241_LIST_I {
    public static void main(String[] args) {

//        List l1 = new ArrayList<>();  // Dynamic Dispatch

        ArrayList l = new ArrayList<>();
        l.add("mayank");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
        System.out.println(l);
    }
}
