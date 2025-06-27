package Tasks_java_ATX13.Tasks_27thJune;

public class Transpose_matrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transpose = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }

        // transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + "|");
            }
            System.out.println();
        }
    }
}