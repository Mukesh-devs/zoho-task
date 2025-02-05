package zoho.Task_1;

public class Logic_2 {
    

// We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


// makeBricks(3, 1, 8) → true
// makeBricks(3, 1, 9) → false
// makeBricks(3, 2, 10) → true

public boolean makeBricks(int small, int big, int goal) {
    int maxBigBricks = goal / 5;
          if (big >= maxBigBricks) {
              goal -= maxBigBricks * 5;
          } else {
              goal -= big * 5;
          }
  
          // Check if the remaining goal can be made using small bricks
          return small >= goal;
  }

//   Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.


// loneSum(1, 2, 3) → 6
// loneSum(3, 2, 3) → 2
// loneSum(3, 3, 3) → 0

public int loneSum(int a, int b, int c) {
    if (a == b && b == c) {
        return 0;
    } else if (a == b) {
        return c;
    } else if (a == c) {
        return b;
    } else if (b == c) {
        return a;
    } else {
        return a + b + c;
    }
  }
  
//   For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().


// roundSum(16, 17, 18) → 60
// roundSum(12, 13, 14) → 30
// roundSum(6, 4, 4) → 10

public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }
  
  public int round10(int num) {
          int remainder = num % 10;
          if (remainder >= 5) {
              return num + (10 - remainder);
          } else {
              return num - remainder;
          }
      }
  
}
