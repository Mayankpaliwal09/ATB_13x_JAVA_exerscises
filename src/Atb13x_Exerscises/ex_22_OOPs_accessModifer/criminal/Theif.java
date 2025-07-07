package Atb13x_Exerscises.ex_22_OOPs_accessModifer.criminal;

import Atb13x_Exerscises.ex_22_OOPs_accessModifer.police.Cop;

public class Theif {
    public static void main(String[] args) {
        Cop theif = new Cop(100);
        theif.gun = 200;
//        theif.canIshoot();   //not accessible becouse of protected
//        theif.thisDefaultF1();  not accessible becouse default in nature

    }
}
