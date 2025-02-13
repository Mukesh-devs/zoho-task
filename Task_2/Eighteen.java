package zoho.Task_2;

import java.util.*;

public class Eighteen {
    public static void main(String[] args) {
        int[] arr1 = {13, 2, 4, 15, 12, 10, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Input: " + Arrays.toString(arr1));
        sortOddEven(arr1);
        System.out.println("Output: " + Arrays.toString(arr1));

        System.out.println("Input: " + Arrays.toString(arr2));
        sortOddEven(arr2);
        System.out.println("Output: " + Arrays.toString(arr2));
    }

    public static void sortOddEven(int[] arr) {
        List<Integer> oddPositions = new ArrayList<>();
        List<Integer> evenPositions = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                oddPositions.add(arr[i]); 
            } else {
                evenPositions.add(arr[i]); 
            }
        }

        oddPositions.sort(Collections.reverseOrder());

        Collections.sort(evenPositions);

        int oddIndex = 0, evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = oddPositions.get(oddIndex++);
            } else {
                arr[i] = evenPositions.get(evenIndex++);
            }
        }
    }
}
