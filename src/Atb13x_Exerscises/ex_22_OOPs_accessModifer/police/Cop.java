package Atb13x_Exerscises.ex_22_OOPs_accessModifer.police;

public class Cop {

    public int gun;
    private String icard;

    public Cop(int bullet){
        this.gun = bullet;
    }


    protected void canIshoot(){
        System.out.println("yes you can");
    }

    void thisDefaultF1(){
        System.out.println("Hi cop");
    }
}
