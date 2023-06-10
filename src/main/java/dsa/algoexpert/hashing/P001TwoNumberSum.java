package dsa.algoexpert.hashing;

import java.util.Arrays;

/** https://www.algoexpert.io/questions/two-number-sum */
public class P001TwoNumberSum {

  // time complexity O(nlogn) and space complexity O(1)
  public int[] twoNumberSum(int[] array, int targetSum) {
    Arrays.sort(array);
    int left = 0, right = array.length - 1;
    while (left < right) {
      int currentSum = array[left] + array[right];
      if (currentSum == targetSum) {
        return new int[] {array[left], array[right]};
      } else if (currentSum < targetSum) {
        left += 1;
      } else if (currentSum > targetSum) {
        right -= 1;
      }
    }
    // Write your code here.
    return new int[0];
  }
}
