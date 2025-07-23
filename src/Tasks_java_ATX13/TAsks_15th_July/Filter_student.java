package Tasks_java_ATX13.TAsks_15th_July;

import java.util.HashMap;
import java.util.Map;

public class Filter_student {
    public static void main(String[] args) {

        Map<Integer,String> studentDetail = new HashMap<>();
        studentDetail.put(101,"Anjali");
        studentDetail.put(102,"Aman");
        studentDetail.put(103,"Ravi");
        studentDetail.put(103,"avi");

        for(Map.Entry<Integer,String> entry : studentDetail.entrySet()){

            if(entry.getValue().toLowerCase().startsWith("a")){
                System.out.println(entry.getKey()+" -> "+ entry.getValue());
            }
        }
    }
}
