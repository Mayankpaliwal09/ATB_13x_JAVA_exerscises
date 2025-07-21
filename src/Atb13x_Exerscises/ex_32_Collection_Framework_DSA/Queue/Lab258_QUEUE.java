package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab258_QUEUE {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
//        Queue q = new PriorityQueue();

        PriorityQueue q = new PriorityQueue<>();
        q.add("Mayank");
        q.add("Mayank");
        q.add("Paliwal");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());   // destructive method
        System.out.println(q);
    }

}
