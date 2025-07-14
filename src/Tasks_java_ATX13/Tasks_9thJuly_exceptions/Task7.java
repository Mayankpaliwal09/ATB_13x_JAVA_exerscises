package Tasks_java_ATX13.Tasks_9thJuly_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task7 {
    public static void main(String[] args) {


        try {
            FileReader fr = new FileReader("c://abc.txt");
            System.out.println("File Found ");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("No such file or directory found");
        }finally {
            System.out.println("Further execution after catch or try");
        }




    }
}
