public class Eleven {
    public static void main(String[] args) {
        int count = 0;
        char c1;
        String str = "a1b3c4";
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < str.length(); i++ ) {
            c1 = str.charAt(i);
            // c2 = str.charAt(i+1);
            if ( Character.isDigit(c1)) {
                if ( i + 1 < str.length() && Character.isDigit(i + 1) ) {
                    count = Integer.parseInt(String.valueOf(c1) + str.charAt(i + 1));
                }
                else {
                    count = Character.getNumericValue(c1);
                }
                if ( i - 1 >= 0 ) {
                    for ( int j = 0; j < count; j++) {
                        sb.append(str.charAt(i-1));
                    }
                }
            }
            
        }
        System.out.println(sb.toString());
    }
}
