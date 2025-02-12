
import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int  c = str.charAt(0);
        if ( (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            System.out.println("ALphabet");

        }
        else {
            System.out.println("not alphabet");
        }
    }
    
}
