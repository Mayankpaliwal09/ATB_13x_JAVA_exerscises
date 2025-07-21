package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab259_LinkedList {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
