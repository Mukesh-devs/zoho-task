public class Reverse_int {

    public static void main(String[] args) {
        int num = 123450;
        int a = num;
        while ( a > 0) {
            System.out.print(a % 10);
            a = a/10;
        }
    }
    
}
