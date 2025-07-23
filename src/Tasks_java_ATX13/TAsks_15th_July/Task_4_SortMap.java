package Tasks_java_ATX13.TAsks_15th_July;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task_4_SortMap {
    public static void main(String[] args) {
        Map<String , Integer> details = new HashMap<>();
        details.put("Ravi",80);
        details.put("Anjali",95);
        details.put("Dipak",75);

        TreeMap<String,Integer> treeMap= new TreeMap<>();
        for(Map.Entry<String,Integer> item: details.entrySet()){
            treeMap.put(item.getKey(), item.getValue());
        }

        for(Map.Entry<String,Integer> item : treeMap.entrySet()){
            System.out.println(item);
        }

    }
}
