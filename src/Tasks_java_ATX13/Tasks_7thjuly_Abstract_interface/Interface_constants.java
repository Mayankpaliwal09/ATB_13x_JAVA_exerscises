package Tasks_java_ATX13.Tasks_7thjuly_Abstract_interface;

public class Interface_constants {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.speedPrint();
    }
    }

interface SpeedLimit{
    final int MAX_SPEED = 120; // implicitly public, static, final

}

class Cars implements SpeedLimit{
    void speedPrint(){
        System.out.println("Max Speed is:"+MAX_SPEED);
    }
}