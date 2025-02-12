package zoho.Task_2;
import java.util.ArrayList;
import java.util.List;

public class Thirty {
    public static List<List<Integer>> getAntiDiagonals(int[][] matrix) {
        int N = matrix.length;
        List<List<Integer>> result = new ArrayList<>();

        // Loop to add diagonals that start from the first row
        for (int col = 0; col < N; col++) {
            List<Integer> diagonal = new ArrayList<>();
            int row = 0;
            int c = col;
            while (row < N && c < N) {
                diagonal.add(matrix[row][c]);
                row++;
                c++;
            }
            result.add(diagonal);
        }

        // Loop to add diagonals that start from the first column (excluding the first element already added)
        for (int row = 1; row < N; row++) {
            List<Integer> diagonal = new ArrayList<>();
            int col = 0;
            int r = row;
            while (r < N && col < N) {
                diagonal.add(matrix[r][col]);
                r++;
                col++;
            }
            result.add(diagonal);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2},
            {3, 4}
        };

        System.out.println(getAntiDiagonals(matrix1));
        System.out.println(getAntiDiagonals(matrix2));
    }
}
