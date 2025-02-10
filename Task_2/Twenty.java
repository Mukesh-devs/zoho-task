
import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int row = 1; row < n; row++) {
            System.out.println();
            for ( int col1 = row; col1 < n; col1++) {
                System.out.print(" ");
            }
            for ( int col2 = 1; col2 <= row; col2++) {
                System.out.print(col2);
            }
            for ( int col3 = 1; col3 < row; col3++) {
                System.out.print(row - col3);
            }
        }
    }
}
