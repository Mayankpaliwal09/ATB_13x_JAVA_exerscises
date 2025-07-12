package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;

public class Stud {
    public void showInfo(){

        System.out.println("Public access : Student Info");
    }

    public static void main(String[] args) {
//        Access in same package, different class

        Stud2 ss = new Stud2();
        ss.showInfo();
    }
}
