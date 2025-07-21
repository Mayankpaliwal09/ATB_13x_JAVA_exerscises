package Tasks_java_ATX13.Tasks_11th_July_ArrayList;

import java.util.ArrayList;

public class Task2_remove_arrlist {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add("Amit");
        names.add("Neha");
        names.add("Suresh");

//        names.remove("neha");   // non destructive method
        System.out.println(names.remove(1));
        System.out.println("Names after removal:");
        System.out.println(names);
    }
}
