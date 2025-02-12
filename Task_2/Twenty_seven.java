package zoho.Task_2;

public class Twenty_seven {
    
    public static void main(String[] args) {
        String str1 = "abc123Hello";
        String str2 = "123";

        if ( str1.contains(str2) ) {
            System.out.println(str1.indexOf(str2));
        }
        else {
            System.out.println(-1);
        }
    }
}
