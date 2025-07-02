package Tasks_java_ATX13.Tasks_27thJune;

import java.util.Scanner;

public class WebBasedDomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you website Url link :");
        if(sc.hasNextInt()){
            System.out.println("please enter valid url");
        } else {

            String url = sc.next();
            if(url.contains(".com")){
                System.out.println("The website type is: Commercial website");
            } else if (url.contains(".org")) {
                System.out.println("The website type is: Non-profit organization");
            } else if (url.contains(".edu")) {
                System.out.println(" The website type is: Educational institution");
            } else if (url.contains(".gov")) {
                System.out.println("The website type is: Government website");
            } else if (url.contains(".net")) {
                System.out.println(" The website type is: Network-related website");
            } else if (url.contains(".info")) {
                System.out.println("The website type is: Informational website");
            } else {
                System.out.println("The website type is: Unknown or other types of websites");
            }
        }



    }
}
