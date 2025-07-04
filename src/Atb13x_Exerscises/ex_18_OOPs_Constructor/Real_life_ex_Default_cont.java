package Atb13x_Exerscises.ex_18_OOPs_Constructor;

public class Real_life_ex_Default_cont {
    public static void main(String[] args) {

        LoginUser u1 = new LoginUser();
        u1.login();
    }
}


class LoginUser{

    String username;
    String password;
    // default constructor having username and password

    LoginUser(){
        username = "mayank";
        password = "123";
    }


    // Method to stimulate login check

   public void login(){

       System.out.println("Attempting login with:");
//       System.out.println("Username: " + username);
//       System.out.println("Password: " + password);

       if(username.equals("mayan") && password.equals("123")){
           System.out.println("login Succesfully");
       } else {
           System.out.println("Login failed!");

       }
    }
}
