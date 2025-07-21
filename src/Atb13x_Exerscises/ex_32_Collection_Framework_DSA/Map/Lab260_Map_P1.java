package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab260_Map_P1 {
    public static void main(String[] args) {
//        Map m1 = new Map();
        Map m1 = new HashMap<>();
        // Map is key and value pair
        // name -> mayank
        m1.put("name","mayank");
        m1.put("Roll_no",1);
        m1.put("Phone",999999999);
//        m1.put(34,90);
        System.out.println(m1);


        Map m2 = new LinkedHashMap();
        m2.put("name","mayank");
        m2.put("rollno",1);
        m2.put("phone",999999999);
        System.out.println(m2);


        Map m3 = new TreeMap();
        m3.put("firstname","mayank");
        m3.put("lastname","paliwal");
        m3.put("rollno",1);
        m3.put("phone",999999999);
        System.out.println(m3);
    }
}
