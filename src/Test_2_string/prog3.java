package Test_2_string;

public class prog3 {
    public static void main(String[] args) {

        int iterate = 1000;
        long startTime = System.nanoTime();
        System.out.println(startTime);
        String str ="";
        for (int i = 0 ; i < iterate ; i++){
            str +="a";
        }
        long endtime = System.nanoTime();
        System.out.println("time taken for string literal : " + (endtime -startTime)/1000000);
    }
}
