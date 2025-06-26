package Atb13x_Exerscises.ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");


        }
        System.out.println(ch == 65);
    }
}

