package dsa.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * https://www.youtube.com/watch?v=VbVQJRKXxBA&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=1
 **/
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    if (nums.length < 2) {
      return new int[] {-1, -1};
    }
    Map<Integer, Integer> hashMap = new HashMap<>();
    for(int i=0;i<nums.length;i++){
      if(hashMap.containsKey(target-nums[i])){
        return new int[]{hashMap.get(target-nums[i]), i};
      }
      hashMap.put(nums[i], i);
    }
	return new int[]{-1, -1};
  }
}
