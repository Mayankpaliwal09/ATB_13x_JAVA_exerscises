package Tasks_java_ATX13.Tasks_4thJuly_AccessModifier;

public class Prog5 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.getAge();

        int age = s1.age;
        System.out.println(age);
    }
}

 class Student2{

    int age = 10;

    void getAge(){
        System.out.println("Age is :" +age);
    }
}
