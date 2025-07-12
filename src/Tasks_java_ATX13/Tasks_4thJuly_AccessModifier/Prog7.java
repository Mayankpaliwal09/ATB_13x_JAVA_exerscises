package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;
import Tasks_java_ATX13.Tasks_4thJuly_AccessModifier.Stud;
public class Prog7 {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.showInfo();

        Stud2 s2 = new Stud2();
        s2.showInfo();

        S2 ss = new S2();
        ss.display();
    }

}


class Stud2{
// Access in the same class
    public void showInfo(){

        System.out.println("Public access : Student Info");
    }
}

class S2 extends Stud2{
//Access in subclass
    public void display(){
        showInfo();
    }
}
