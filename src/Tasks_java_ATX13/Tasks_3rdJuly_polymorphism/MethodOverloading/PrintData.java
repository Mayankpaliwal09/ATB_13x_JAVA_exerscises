package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverloading;

public class PrintData {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.printData(10);
        p1.printData("mayank");
        p1.printData(1.22F);
        p1.printData('c');
    }
}

class Printer{

    void printData(int data){
        System.out.println(data);
    }

    void printData(String  data){
        System.out.println(data);
    }

    void printData(float data){
        System.out.println(data);
    }

    void printData(char data){
        System.out.println(data);
    }
}