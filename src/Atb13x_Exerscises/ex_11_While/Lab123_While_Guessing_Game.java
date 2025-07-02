package Atb13x_Exerscises.ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();
        int number_toGuess= random.nextInt(0,100)+1;
//        System.out.println(number_toGuess);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int guess;
        int attempt=0;

        while (true){
            guess = sc.nextInt();
            attempt++;

            if(number_toGuess<guess){
                System.out.println("try lower number");
            } else if (number_toGuess > guess){
                System.out.println("try higher number");
            } else {
                System.out.println("Correct! You guessed it in " + attempt + " attempts");
                break;
            }
        }

        System.out.println("guessed no is : "+number_toGuess);
    }
}
