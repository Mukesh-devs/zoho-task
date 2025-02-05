package zoho.Task_1;

public class Array_ {
    

//     Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.


// firstLast6([1, 2, 6]) → true
// firstLast6([6, 1, 2, 3]) → true
// firstLast6([13, 6, 1, 2, 3]) → false

public boolean firstLast6(int[] nums) {
    return nums[0] == 6 || nums[nums.length - 1] == 6;
  
  }

  
// Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.


// makePi() → [3, 1, 4]

public int[] makePi() {
    return new int[]{3, 1, 4};
  }

//   Given an array of ints length 3, return the sum of all the elements.


// sum3([1, 2, 3]) → 6
// sum3([5, 11, 2]) → 18
// sum3([7, 0, 0]) → 7

public int sum3(int[] nums) {
    return nums[0] + nums[1] + nums[2];
  }
  

// Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


// middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
// middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
// middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

public int[] middleWay(int[] a, int[] b) {
    return new int[]{a[1], b[1]};

}


// Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.


// biggerTwo([1, 2], [3, 4]) → [3, 4]
// biggerTwo([3, 4], [1, 2]) → [3, 4]
// biggerTwo([1, 1], [1, 2]) → [1, 2]

public int[] biggerTwo(int[] a, int[] b) {
    int sumA = a[0] + a[1];
    int sumB = b[0] + b[1];
  
    if (sumA >= sumB) {
        return a;
    } else {
        return b;
    }
}


}
