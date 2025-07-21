package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {

        List fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List fruits2 = new ArrayList<>();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);


        List allFruits = new ArrayList<>();
        allFruits.add(fruits1);
        allFruits.add(fruits2);
        allFruits.add(vegatables);

        System.out.println(allFruits);


    }
}
