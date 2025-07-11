package Atb13x_Exerscises.ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {

        System.out.println(Day.FRIDAY);
        System.out.println(ProjectNmaes.restassured);
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum ProjectNmaes{
    google, restassured, katalon, vwo
}

//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}