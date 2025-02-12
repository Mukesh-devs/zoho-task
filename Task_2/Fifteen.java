
import java.util.HashSet;
import java.util.Set;

public class Fifteen {
    
    public static void main(String[] args) {
        Set<Integer> dup = new HashSet<>();
        int[] arr = { 1,1, 2};
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = i+1; j < arr.length; j++) {
                if ( arr[i] == arr[j]) {
                    dup.add(arr[i]);
                }
            }
        }

        System.out.println(dup.toString());
    }
}
