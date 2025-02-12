// package zoho.Task_2;

public class Bitwise {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int bin1,bin2;
        bin1 = Integer.parseInt(tobinary(num1));
        bin2 = Integer.parseInt(tobinary(num2));
        // int bit_and = bitwise_and(num1, num2);
        System.out.println("Bitwise AND = "+ (bin1 & bin2));
        System.out.println("Bitwise OR = "+ (bin1 | bin2));
        System.out.println("Bitwise XOR = "+(bin1 ^ bin2));
        System.out.println("Bitwise Complement of num1 = "+~bin1+" Bitwise Complement of num2 = "+~bin2);
    }

    public static String tobinary(int num) {
        // int bin = 0;
        if (num == 0) return "0";
        if (num == 1) return "1";
        return tobinary(num/2) + (num%2);
        // return bin;
    }
    
}
