package zoho.Task_2;

import java.util.ArrayList;
import java.util.List;

public class Groups {
    public static void main(String[] args) {
        int g;
        int[] arr = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
        List<List<Integer>> g1 = new ArrayList<>();
        for ( int i = 0; i < 4; i++) {
            g1.add(new ArrayList<>());
        }
        for ( int i = 1; i <= arr.length; i++ ) {
            g = (i - 1) % 4;
            g1.get(g).add(arr[i-1]);

        }
        for ( int i = 0; i< 4; i++) {
            System.out.println(g1.get(i));
        }
    }
}
