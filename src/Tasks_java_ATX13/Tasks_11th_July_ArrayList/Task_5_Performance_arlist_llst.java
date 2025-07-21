package Tasks_java_ATX13.Tasks_11th_July_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_5_Performance_arlist_llst {
    public static void main(String[] args) {

        List<Long> arrlist = new ArrayList<>();
        Long startTime = 0L;
        Long endTime = 0L;

        startTime = System.currentTimeMillis();
        for(Long i = 0L; i<= 99999; i++){
            arrlist.add(i);
        }
        endTime = System.currentTimeMillis();
        Long arrPerformance = endTime-startTime;
//        System.out.println("ArrayList Time:"+arrPerformance+" ms");


        List<Long> ll = new LinkedList();
        startTime = System.currentTimeMillis();
        for(Long i = 0L; i<= 99999; i++){
            ll.add(i);
        }
        endTime = System.currentTimeMillis();
        Long llPerformance = endTime-startTime;
//        System.out.println("LinkedList time :"+llPerformance+" ms");


        System.out.println("Time taken to add 100,000 elements:");
        System.out.println("ArrayList:  " + arrPerformance + " ms");
        System.out.println("LinkedList: " + llPerformance + " ms");
    }


}
