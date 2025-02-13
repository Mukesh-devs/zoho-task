
package zoho.Task_2;
public class Twenty_one {
    public static void main(String[] args) {
        int n = 9; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = n - i; j <= n; j++) {
                System.out.print(j + " ");
            }

            for (int j = n - 1; j >= n - i; j--) {
                System.out.print(j + " ");
            }

            System.out.println(); 
        }
    }
}
