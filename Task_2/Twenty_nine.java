package zoho.Task_2;

import java.util.Scanner;

public class Twenty_nine {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        for ( int i = 1; i <= num; i++ ) {
            if ( i == 1 || i == num ) {
                for ( int j = 0; j < num; j++ ) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
