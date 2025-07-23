package Tasks_java_ATX13.TAsks_15th_July;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_word_by_Length {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun", "cool", "Hi"};
        Map<Integer, List<String>> wordMap = new HashMap<>();


        for(String word : words){

            int len = word.length();

            if(!wordMap.containsKey(len)){
                wordMap.put(len, new ArrayList<>());
            }

            wordMap.get(len).add(word);
        }

        for(Map.Entry<Integer,List<String>> entry : wordMap.entrySet()){
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }
    }
}
