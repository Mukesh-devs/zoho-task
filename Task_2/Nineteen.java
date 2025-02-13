package zoho.Task_2;
import java.util.Arrays;

public class Nineteen {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Array:");
        printArray(arr);

        leftRotate(arr);

        System.out.println("\nArray after left rotation:");
        printArray(arr);
    }

    public static void leftRotate(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        
        int firstElement = arr[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 1; j++) {
                arr[i][j] = arr[i][j + 1];
            }
            if (i < rows - 1) {
                arr[i][cols - 1] = arr[i + 1][0];
            }
        }

        arr[rows - 1][cols - 1] = firstElement;
    }
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
