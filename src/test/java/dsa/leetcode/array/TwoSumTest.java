package dsa.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TwoSumTest {
	private static TwoSum twoSum;
	@BeforeAll
	static  void setTwoSum() {
		twoSum = new TwoSum();
	}

  /**
   * Input: nums = [2,11,15,7], target = 9
   * Output: [0,3]
   * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
   **/
  @Test
  void whenTestCase1_then_call_twoSum() {
	  int[] nums = {2,11,15, 7};
	  int target = 9;
	  int[] res = twoSum.twoSum(nums, target);
	  assertEquals(2, res.length);
	  assertEquals(0, res[0]);
	  assertEquals(3, res[1]);
  }
}
