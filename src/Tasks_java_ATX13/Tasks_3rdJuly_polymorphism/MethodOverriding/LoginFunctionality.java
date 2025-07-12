package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverriding;

public class LoginFunctionality {
    public static void main(String[] args) {
        User u1 = new User();   // Base class object
        User u2 = new AdminUser();  // Polymorphic reference
        User u3 = new RegularUser(); // Polymorphic reference

        u1.login();
        u2.login();
        u3.login();
    }
}

class User{

    void login(){
        System.out.println("User Login");
    }
}

class AdminUser extends User{

    void login(){
        System.out.println("Admin Login: accesss to admin dashboard");
    }
}

class RegularUser extends User{

    void login(){
        System.out.println("Regular User : access to home page");
    }
}