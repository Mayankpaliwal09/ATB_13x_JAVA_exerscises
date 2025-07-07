package Atb13x_Exerscises.ex_22_OOPs_accessModifer;

public class Lab192 {
}

class Father {
    private int gold = 1000;
    int car = 1;
    public int bhk3 = 1;

}

class son extends Father{
    void weCanuse(){
//        System.out.println(gold);  // not acccesible becouse of private
        System.out.println(car);
        System.out.println(bhk3);
    }
}
