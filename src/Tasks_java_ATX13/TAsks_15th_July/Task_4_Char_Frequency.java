package Tasks_java_ATX13.TAsks_15th_July;

import java.util.HashMap;
import java.util.Map;

public class Task_4_Char_Frequency {
    public static void main(String[] args) {

        String sentence =  "java is easy and java is powerful";
        sentence = sentence.replace(" ", ""); // remove space
        // converting wrapper into array
        Character []ch = new Character[sentence.length()];
        Map<Character,Integer> freq = new HashMap<>();

        for(int i = 0; i< sentence.length();i++){
            ch[i] = sentence.charAt(i);
        }

        for (Character c : ch) {
//            System.out.print(o+" ");
            freq.put(c, freq.getOrDefault(c,0)+1);

        }

        System.out.println(freq);
    }
}
