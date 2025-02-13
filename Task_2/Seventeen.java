package zoho.Task_2;

import java.util.Arrays;

public class Seventeen {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Input: " + Arrays.toString(arr));
        alternateSort(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }

    public static void alternateSort(int[] arr) {
        Arrays.sort(arr); 

        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1;
        int index = 0;

        while (left <= right) {
            if (index % 2 == 0) {
                result[index++] = arr[right--]; 
            } else {
                result[index++] = arr[left++]; 
            }
        }

        System.arraycopy(result, 0, arr, 0, arr.length);
    }
}
