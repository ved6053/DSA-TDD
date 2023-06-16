package dsa.leetcode.array;

/**
 * https://leetcode.com/problems/product-of-array-except-self/description/
 * https://www.youtube.com/watch?v=6p7mfKopfLY&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=21
 */
public class ProductOfArrayExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    int[] ans = new int[nums.length];
    ans[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      ans[i] = (ans[i - 1] * nums[i - 1]) % (Integer.MAX_VALUE - 1);
    }
    int product = nums[nums.length - 1];
    for (int i = nums.length - 2; i >= 0; i--) {
      ans[i] = (ans[i] * product) % (Integer.MAX_VALUE - 1);
      product = (product * nums[i]) % (Integer.MAX_VALUE - 1);
    }
    return ans;
  }
}
