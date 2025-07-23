package Tasks_java_ATX13.TAsks_15th_July;

import java.util.HashMap;
import java.util.Map;

public class Task_8_Frquent_Chracter_string {
    public static void main(String[] args) {

        String input = "aaaabbbcc";

        Map<Character,Integer> frqChar= new HashMap<>();

        for(Character ch : input.toCharArray()){
            if (ch == ' ') continue;
            frqChar.put(ch, frqChar.getOrDefault(ch,0)+1);
        }

//        System.out.println(frqChar);

        // printing most freq charcter

        int maxFreq = 0;
        char maxChar = '0';

        for(Map.Entry<Character,Integer> entry: frqChar.entrySet()){

            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Most frequent character is: "+maxChar + "(" + maxFreq +" times)");

    }
}
