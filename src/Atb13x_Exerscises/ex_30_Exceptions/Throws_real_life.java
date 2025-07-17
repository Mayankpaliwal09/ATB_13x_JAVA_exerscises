package Atb13x_Exerscises.ex_30_Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Throws_real_life {
    public static void main(String[] args) {
        try {
            readFile();  // We call the method that throws IOException
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    // This method MUST declare 'throws IOException' because FileReader can throw it
    public static void readFile() throws IOException {
        FileReader reader = new FileReader("myfile.txt");  // File may not exist!
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();
    }
}
