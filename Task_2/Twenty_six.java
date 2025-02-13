package zoho.Task_2;

import java.util.Scanner;

public class Twenty_six {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("_");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print("_");
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}