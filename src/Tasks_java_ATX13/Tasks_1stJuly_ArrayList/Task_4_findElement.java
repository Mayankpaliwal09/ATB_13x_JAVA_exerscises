package Tasks_java_ATX13.Tasks_1stJuly_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_4_findElement {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        // entering city in the arraylist
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter city to arrayList :");

        boolean b = true;
        while (b){
            System.out.println("Enter city name :");
            String enterCity = sc.next().toUpperCase();
            cities.add(enterCity);

            sc.nextLine();
            System.out.println("You Want to enter more cities (Y/N):");
            String res = sc.nextLine().trim().toUpperCase();
            if(res.equals("N")){
                b=false;
            }

        }

        System.out.println(cities);


        System.out.println("Enter City name to find : ");
        String cityToFind = sc.next().toUpperCase();

        if(cities.contains(cityToFind)){
            System.out.println(cityToFind+" is in the list");
        } else {
            System.out.println("No such city in the list");
        }

    }
}
