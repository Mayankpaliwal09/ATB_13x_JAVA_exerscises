package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverriding;

public class EmployeeRoleInfo {
    public static void main(String[] args) {

        Employee emp1 = new Employee();  // General
        Employee emp2 = new Manager();   // Specialized
        Employee emp3 = new Clerk();     // Specialized
        Employee emp4 = new Tester();    // Specialized

        emp1.role();
        emp2.role();
        emp3.role();
        emp4.role();
    }
}

class Employee{

    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{

    void role(){
        System.out.println("Manager , manage teams and tasks");
    }
}

class Clerk extends Employee{

    void role(){
        System.out.println("Clerk ,handles Administration tasks");
    }
}

class Tester extends Employee{

    void role(){
        System.out.println("Tester , Tests the software free of bugs");
    }
}