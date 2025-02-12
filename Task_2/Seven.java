public class Seven {
    
    public static void main(String[] args) {
        // a+=a++ + ++a + –a + a–; when a=28

        int a = 28;
        int b = 20;

        a+=a++;
        a = a + ++a;
        a = a + -a;
        a = a + a--;
        System.out.println(a);
    }
}
