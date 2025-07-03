package Atb13x_Exerscises.ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int []arr = {25,14, 56, 15, 36, 56, 77, 18, 29, 49}; // 0 to 9
//        Arrays.sort(arr);  // destructive method
//        for(int i = 0 ; i<arr.length-1;i++){
//            System.out.print(arr[i]+",");
//        }
        System.out.println(arr[arr.length-1]); // it give the index value
        System.out.println(arr.length-1);   // it give the index



        int min_output = give_me_min(arr);
        int max_output = give_me_max(arr);

        System.out.println(min_output);
        System.out.println(max_output);
    }

    private static int give_me_min(int[] arr) {

        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }
        return min;
    }

    private static int give_me_max(int[] arr) {
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }
}
