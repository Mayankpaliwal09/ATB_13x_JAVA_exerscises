package Atb13x_Exerscises.ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
//
//        VWOLogin v1 = new VWOLogin("admin" ,"123");
//        System.out.println(v1.password);
//        v1.password = "1111";
//        System.out.println(v1.password);


        //
        GoodVWOLogin v2 = new GoodVWOLogin("mayank" , "4444");
//        System.out.println(v2.password);
        v2.setPassword("mayank123",true);
       String pass =  v2.getPassword();
        System.out.println(pass);
    }
}

class VWOLogin{
   public String username;
   public String password;

   //constructor
   public VWOLogin(String username,String password){
     this.username = username;
     this.password = password;

//       System.out.println("logged in");
   }
}

class GoodVWOLogin{
    private String username;
    private String password;

   public GoodVWOLogin(String user ,String pass){
       this.username = user;
       this.password = pass;
   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
            System.out.println("Password change succesfully");
        } else {
            System.out.println("you are not admin cant change password");
        }
    }
}

