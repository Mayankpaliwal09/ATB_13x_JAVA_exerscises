package Atb13x_Exerscises.ex_16_Arrays;

import java.util.Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
        System.out.println();
        System.out.println("------------");

        for (String arg: args){
            System.out.print(arg);
        }
    }
}
