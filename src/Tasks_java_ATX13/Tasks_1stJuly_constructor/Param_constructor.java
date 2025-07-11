package Tasks_java_ATX13.Tasks_1stJuly_constructor;

public class Param_constructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee("mayank",22);
        System.out.println("name is :"+emp1.name);
        System.out.println("age is :"+emp1.age);
    }
}

class Employee{

    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age=age;

//        name = name;
//        age=age;
        System.out.println("This is parameterized constructor");
    }
}

