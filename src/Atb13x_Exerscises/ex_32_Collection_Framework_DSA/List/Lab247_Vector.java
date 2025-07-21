package Atb13x_Exerscises.ex_32_Collection_Framework_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {

        Vector v1 = new Vector<>();
        Vector v2 = new Vector(10);

        v1.add("mayank");
        v1.add("paliwal");
        v1.add(123);
        System.out.println(v1);
        v1.add(true);
        v1.add("abc");
        v1.add(null);
        v1.add(null);
        System.out.println(v1);
        v1.get(0);
        System.out.println(v1.size());


        // now lets print the elements of vector

        // for loop

        for(int i = 0 ; i< v1.size(); i++){
            System.out.print(v1.get(i)+" , ");
        }

        System.out.println();
        System.out.println(" ----  For  Each Loop ");

        for (Object o : v1){
            System.out.print(o+",");
        }

        System.out.println();
        System.out.println(" ----  Iterator ");


        Iterator i = v1.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" , ");
        }

        System.out.println();
        System.out.println(" ----  Enumeration ");

        Enumeration<Object> enumIterator = v1.elements();
        while (enumIterator.hasMoreElements()){
            System.out.print(enumIterator.nextElement()+",");
        }
    }
}
