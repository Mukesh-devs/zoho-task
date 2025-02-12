package zoho.Task_2;

import java.util.Scanner;

public class Twenty_four {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ind = 1;
        int c = 1;
        for (int i = 1; c <= n; i++) {
            for (int j = 1; j <= i && c <= n; j++) {
                System.out.print(c+ " ");
                c++;
            }
            System.out.println(); 
        }
    }
}
