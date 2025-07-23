package Tasks_java_ATX13.TAsks_15th_July;

import java.util.HashMap;
import java.util.Map;

public class Task_2_Word_freq {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";
        String [] word = sentence.split("");

        Map<String,Integer> countWord = new HashMap<>();

        for(String w: word){
           if(w.equals(" ")){
               continue;
           } else{
               countWord.put(w, countWord.getOrDefault(w,0)+1);
           }
        }

        System.out.println(countWord);
    }
}
