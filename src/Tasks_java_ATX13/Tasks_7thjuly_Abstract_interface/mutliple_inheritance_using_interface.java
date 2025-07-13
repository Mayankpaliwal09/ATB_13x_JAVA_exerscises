package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

public class mutliple_inheritance_using_interface {
    public static void main(String[] args) {
        Document d1 = new Document();
        d1.print();
        d1.show();
    }
}

interface Printable{
    void print();
}

interface Showable{

    void show();
}

class Document implements Printable,Showable{

   public void print(){
       System.out.println("Printing the document");
    }

    public void show(){
        System.out.println("Showing Document");
    }
}