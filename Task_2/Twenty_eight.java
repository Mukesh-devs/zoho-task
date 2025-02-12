package zoho.Task_2;
import java.util.Scanner;

public class Twenty_eight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;

        int currentTerm = 1;

        for (int i = 1; i <= n; i++) {
            if (i != 1) {
                System.out.print(" + ");
            }
            System.out.print(currentTerm);
            sum += currentTerm;
            currentTerm = currentTerm * 10 + 1;
        }

        System.out.println();
        System.out.println("The Sum is: " + sum);
        
        scanner.close();
    }
}
