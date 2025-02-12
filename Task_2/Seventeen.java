
import java.util.Arrays;





public class Seventeen {
    public static void main(String[] args) {
        
        int[] arr = { 1,3,5,7,4,8};
        
        
}

public static void sorted(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    Arrays.sort(arr);
    int[] res = new int[arr.length];
    for ( int i = 0; i < arr.length; i++) {
        if ( i % 2 == 0 ) { 
            res[i] = arr[i];
        }
    }
}
}
