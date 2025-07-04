package Atb13x_Exerscises.ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {


        Baby b1= new Baby();
        b1.f1();

    }
}


class Baby{
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    // Default Constructor!
    Baby(){
        System.out.println("I am deafult constructor");
        System.out.println("Your Aadhar Number is ready!");

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }


    // function / method
    void f1(){
        System.out.println("I am function from class");
    }
}
