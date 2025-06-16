package Tasks_java_ATX13.Tasks_16th_June;


import java.util.Scanner;

public class Triangle_classifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first side : ");
        int side_a = sc.nextInt();


        System.out.println("Enter second side : ");
        int side_b = sc.nextInt();



        System.out.println("Enter third side : ");
        int side_c = sc.nextInt();


//        System.out.println(side_a+" " +side_b+" "+side_c);


        if(side_a == side_b && side_b == side_c){
            System.out.println("Triangle is Equilateral");
        } else if (side_a == side_b || side_b == side_c || side_c == side_a) {
            System.out.println("Triangle is isoscles");
        } else {
            System.out.println("Triangle is scalene");
        }
    }
}
