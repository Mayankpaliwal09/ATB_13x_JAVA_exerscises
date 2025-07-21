package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SET_P1 {
    public static void main(String[] args) {

        Set hs = new HashSet<>();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        // duplicate treat as one / no allowed
        // order not maintained
        hs.add("Mayank");
        hs.add("Mayank");
        hs.add("Paliwal");
        System.out.println(hs);

    }
}
