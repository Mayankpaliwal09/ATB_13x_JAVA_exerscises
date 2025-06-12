package Tasks_java_ATX13.Tasks_12Th_june_ternary;

public class Grade_calculation_nested_ternary {
    public static void main(String[] args) {
        int marks = 90;

        String result = (marks >= 90) ? "A+" : (marks >= 75) ? "a" : (marks>=60 ) ? "B" : (marks >=40) ? "C" : "fail";

        System.out.println(result);
    }
}
