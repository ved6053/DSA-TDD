package dsa.algoexpert.hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.algoexpert.io/questions/two-number-sum
 **/
public class P001TwoNumberSum {

  //time complexity O(n) and space complexity O(n)
  public  int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> hashSet = new HashSet<>();
    for (int element : array) {
      if (hashSet.contains(targetSum - element)) {
        return new int[] {targetSum - element, element};
      }
      hashSet.add(element);
    }
    // Write your code here.
    return new int[0];
  }
  
}
