package Tasks_java_ATX13.Tasks_27thJune;

public class DaigonalMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}
        };

        int mainDaiogonalSum = 0;



        for(int i =0; i<arr.length; i++){

            for(int j=0; j<arr[i].length;j++){
               if(i==j){
                   System.out.println("Main daigonal are : "+arr[i][j]);
                   mainDaiogonalSum += arr[i][j];
               }

            }
        }
        System.out.println("sum of daiogonal is : " +mainDaiogonalSum);


        System.out.println(" -- Anti Daigonal --");

        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                if (i + j == arr.length - 1) {
                    System.out.println("Anti-diagonal element at [" + i + "][" + j + "] is " + arr[i][j]);
                }

            }
        }

    }
}
