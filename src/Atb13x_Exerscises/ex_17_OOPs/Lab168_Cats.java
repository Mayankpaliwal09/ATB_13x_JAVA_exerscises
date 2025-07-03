package Atb13x_Exerscises.ex_17_OOPs;

class cat{

    String name;

    void running(){
        System.out.println("Cat is running");
    }
}


// main class below


public class Lab168_Cats {
   Lab168_Cats(){
       System.out.println("This is main class / constructor");
   }

    public static void main(String[] args) {

       cat c1 = new cat();
       new cat();
       cat c2;
       c1.running();

//       c2.running();
       new cat().running();
    }
}


