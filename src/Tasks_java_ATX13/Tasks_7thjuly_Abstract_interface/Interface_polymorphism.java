package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

public class Interface_polymorphism {
    public static void main(String[] args) {

        Playable instrument;
        // Pointing to Guitar object
        instrument = new Guitar();
        instrument.play();
//        instrument.play();

        // Pointing to Piano object
        instrument = new Piano();
        instrument.play();

    }
}

interface Playable{

    void play();
}

class Piano implements Playable{

   public void play(){
        System.out.println("Playing Piano");
    }
}

class Guitar implements Playable{
   public void play(){
        System.out.println("Playing Guitar");
    }
}