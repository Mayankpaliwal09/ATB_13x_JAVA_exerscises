package Tasks_java_ATX13.TAsks_15th_July;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task_5_non_repated {

    public static void main(String[] args) {
//
//        Key Properties of LinkedHashMap:
//        Maintains insertion order.
//        Works like a regular Map (keys are unique).
//        We can store characters as keys and their frequency (count) as values.
//
//        This means:
//        We can count occurrences of characters.
//        And preserve the order in which characters appeared — essential for finding the first non-repeated one.

        String input = "aabbccdeeff";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char ch: input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        // using


        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                System.out.println("First non-repeated character is: " + entry.getKey());
            }
        }


    }
}
