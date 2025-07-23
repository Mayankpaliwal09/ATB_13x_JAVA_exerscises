package Tasks_java_ATX13.TAsks_15th_July;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_3_Iterate_HashMap {
    public static void main(String[] args) {

        Map<String , String> details = new HashMap<>();
        details.put("Name","Dipak");
        details.put("Role","Tester");
        details.put("Level","Senior");

//        System.out.println();

        System.out.print("Iteration of Map using EntrySet() --> ");
        // iterate using entrySet()  // gives both key value pairs
        for(Map.Entry<String,String> item: details.entrySet()){
            System.out.print(item +" , ");
        }

        System.out.println();

        System.out.print("Iteration of Map using KeySet() --> ");
        // Iterate using keySet() -- gives only key
        for(String key: details.keySet()){
            System.out.print(key +" , ");
        }


        System.out.println();
        System.out.print("Iteration of Map using iterator --> ");
        // Iterate using Iterator

        Iterator<Map.Entry<String,String>>  itr = details.entrySet().iterator();

        while (itr.hasNext()){
            System.out.print(itr.next());
        }





    }
}
