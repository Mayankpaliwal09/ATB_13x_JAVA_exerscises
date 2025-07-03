package Atb13x_Exerscises.ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9

        // array initialization using an initializer list
        int arr2d [][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr2d.length; i++) {
            System.out.print("{");


            for (int j = 0; j < arr2d.length ; j++) {

                System.out.print(" "+arr2d[i][j] + " ");

            }
            System.out.print("}");
            System.out.println();
        }

        // using new keyword
        //  When you create an array using new it's called dynamic initialization or array creation using the new operator.
        int arr2 [][] = new int[][]{
                {20,20,40},
                {50,60,70},
                {80,90,100}
        };



        int arr3[][] = new int[3][4]; // 3 row 4 column
        //row 1
        arr3[0][0]=1;  // col 1
        arr3[0][1]=2;  // col 2
        arr3[0][2]=3;   // col 3
        arr3[0][3]=4;  // col 4

        //Row 2
        arr3[0][0]=5; // col 1
        arr3[0][1]=6; // col 2
        arr3[0][2]=7; // col 3
        arr3[0][3]=8; // col 4

        // row 3
        arr3[0][0]=9; // col 1
        arr3[0][1]=10; // col 2
        arr3[0][2]=1;// col 3
        arr3[0][3]=12; // col 4


    }
}
