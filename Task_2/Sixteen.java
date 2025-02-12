
import java.util.HashSet;
import java.util.Set;

public class Sixteen {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3};
        int[] arr2 = { 2 ,3, 7};
        
        Set<Integer> arr = new HashSet<>();
        for ( int i = 0; i < arr1.length; i++ ) {
            arr.add(arr1[i]);
        }
        for ( int i = 0; i < arr2.length; i++) {
            arr.add(arr2[i]);
        }

        System.out.println(arr.toString());
    }    
}
