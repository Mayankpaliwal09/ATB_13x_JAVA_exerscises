package Tasks_java_ATX13.Tasks_17th_june;

import java.util.Scanner;
public class Count_Vowels_and_Cosonant {
    public static void main(String[] args) {
//        Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

//        String name = "mayank";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Count Vowel And Consonant :");
        if(sc.hasNextInt()){
            System.out.println("you fool enter a string");
            return;
        }
        String name = sc.next().toLowerCase();


        int countVowel = 0;
        int countConsonant = 0;


        for (int i = 0; i <= name.length()-1 ; i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'  ){
                countVowel++;
            } else  {
                countConsonant++;
            }


        }
        System.out.println("Total no of Vowel are :" + countVowel);
        System.out.println("Total no of Consonant are :" + countConsonant);
    }
}
