package Tasks_java_ATX13.Tasks_11th_July_ArrayList;

import java.util.ArrayList;

public class Task_1_Insert_ArrayList {
    public static void main(String[] args) {

        ArrayList names = new ArrayList();
        names.add("dipak");
        names.add("Ravi");
        names.add("Sneha");
        names.add("Priya");
        names.add("Anjali");

        System.out.println("Student List:");
      for(Object name : names){
          System.out.println(name);
      }
    }
}
