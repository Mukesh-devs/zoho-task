
import java.util.Scanner;

public class Twenty_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for ( int row = n ; row < 0; row--) {
            System.out.println();
            for ( int col1 = row-1; col1 < 1; col1--) {
                System.out.print(" ");
            }
            for ( int col2 = 1; col2 <= row; col2++) {
                System.out.print();
            }
            for ( int col3 = 1; col3 < row; col3++) {
                System.out.print(row - col3);
            }
        }
    }
}
