package zoho.Task_2;

import java.util.Scanner;

public class Twenty_four {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int num = 1; 
        int rows = 1; 

        while (num <= n) {
            for (int i = 1; i <= (n - rows) ; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= rows; i++) {
                if (num > n) {
                    break; 
                }
                System.out.print(num + " "); 
                num++;
            }
            System.out.println();
            rows++; 
        }
    
    }
    
}