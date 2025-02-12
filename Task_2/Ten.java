public class Ten {
    public static void main(String[] args) {
        String str = "I love India";
        System.out.println(reverse(str));


    }

    public static String reverse(String str) {
        // sep = " ";
        // String[] st = str.split(" ");
        if ( str.length() == 0 ) {
            return str;
        }
        int ind = str.indexOf(" ");
        if ( ind == -1) {
            return str;
        }

        String first_s = str.substring(0,ind);
        str = str.substring(ind+1); 
        return reverse(str) +" "+ first_s;
        
    }
        
    
}
