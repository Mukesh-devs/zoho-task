// 1) Write a program to print a letters from the user input character to 'Z' without using
// strings.
// Example 1:  input : X
// Output : XYZ
// Example 2:  Input : M
// Output : MNOPQRSTUWXYZ 
// package zoho.Task_2;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        int ascii = c;
        for ( int i = ascii; i <= 90; i++) {
            // c = i;
            System.out.print((char)i);
        }
        sc.close();
    }
}
