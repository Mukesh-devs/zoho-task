
import java.util.Scanner;

// package ZOHO-TASK.Task2;

public class Polynomial {
    public static void main(String []args) {
        double x,a,b,c;
        double x1 = 0,x2 = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // double p1;

        if (( Math.pow(b, 2) - 4 * a * c) > 0 ){
        x1 = -b + Math.sqrt((Math.pow(b, 2) - (4 * a * c))/2*a);
        x2 = -b - Math.sqrt((Math.pow(b, 2) - (4 * a * c))/2*a);
            
        }

        System.out.println(x1+" "+x2);
    }
}
