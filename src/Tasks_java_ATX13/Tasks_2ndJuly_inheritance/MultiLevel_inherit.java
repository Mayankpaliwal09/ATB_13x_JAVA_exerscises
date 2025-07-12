package Tasks_java_ATX13.Tasks_2ndJuly_inheritance;

public class MultiLevel_inherit {
    public static void main(String[] args) {

        SuperAdmin s1 = new SuperAdmin();
        s1.display();
//        s1.login();
//        s1.accessAdminPanel();
//        s1.shutDownSystem();
    }
}

class User{

    void login(){
        System.out.println("user login method");
    }
}

class AdminUser extends User{

    void accessAdminPanel(){
        System.out.println("Admin panel method called .");
    }
}

class SuperAdmin extends AdminUser{
    void shutDownSystem(){
        System.out.println("this is superAdmin class method");
    }

    void display(){
        login();
        accessAdminPanel();
        shutDownSystem();
    }
}
