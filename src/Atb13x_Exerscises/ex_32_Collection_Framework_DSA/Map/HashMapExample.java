package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap();
        vehicles.put("MG Astor",1);
        vehicles.put("i10",2);
        vehicles.put("Honda ACTIVA",1);
        vehicles.put("BMW",2);
        vehicles.put("TESLA",5);
        vehicles.put("TESLA",10);
//        vehicles.put(234,"dasda");
        System.out.println("Total Vehicles : "+ vehicles.size());
//        System.out.println(vehicles.keySet());
//        System.out.println(vehicles.values());
//        System.out.println(vehicles.get("TESLA"));

        // Iterator over the Map

        for(String key : vehicles.keySet()){
//            System.out.println(key + " -> "+vehicles.get(key)); // it will give the specific value of corresponding key
//            System.out.println(key + " -> "+vehicles.values());  // it gives all the values

        }


        // Checking if key exists
        if(vehicles.containsKey("Audi")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        // Clearing the map
        vehicles.clear();
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}
