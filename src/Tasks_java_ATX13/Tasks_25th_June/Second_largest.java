package Tasks_java_ATX13.Tasks_25th_June;

public class Second_largest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 20};

       int largest = Integer.MIN_VALUE;
       int prevLargest = Integer.MIN_VALUE;

//        System.out.println(arr.length);

        for(int num : arr){
            if(num > largest){
                prevLargest = largest;
                largest = num;

            } else if (num > prevLargest && num != largest){
                  prevLargest = num;
            }
        }

        System.out.println(largest);
        System.out.println(prevLargest);


    }
}
