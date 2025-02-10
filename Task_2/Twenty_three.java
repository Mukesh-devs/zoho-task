
import java.util.Scanner;

public class Twenty_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for ( int row = 1; row <= n; row++){
            System.out.println("");
            for ( int col2 = 1; col2 < row; col2++) {
                System.out.print(" ");
            }
            for ( int col = 0; col <= n-row; col++ ) {
                System.out.print(n-row+1);
                System.out.print(" ");
            }
        }
    }
}
