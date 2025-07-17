package Atb13x_Exerscises.ex_31_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Generics_List {
    public static void main(String[] args) {
        List normalList = new ArrayList<>();
        normalList.add(10);
        normalList.add("mayank");
        normalList.add(true);
        normalList.add(null);
        normalList.add(null);
        System.out.println(normalList);

        List <Integer> integerList = new ArrayList<>();
        integerList.add(1);
//        integerList.add("mayank");
        System.out.println(integerList);

    }
}

// List - Collection Framework ->collection of items -> 12,3, pramd, dutta.
