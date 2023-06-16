package dsa.leetcode.kaddane.algorithm;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidAlgorithmParameterException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MaximumSubArraySumTest {

  private static MaximumSubArraySum maximumSubArraySum;

  @BeforeAll
  static void setup() {
    maximumSubArraySum = new MaximumSubArraySum();
  }
  /**
   * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The subarray [4,-1,2,1] has the
   * largest sum 6.
   */
  @Test
  void when_test_case_1_then_call_maxSubArraySum() throws InvalidAlgorithmParameterException {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    assertEquals(6, maximumSubArraySum.maxSubArraySum(nums));
  }

  /** Input: nums = [1] Output: 1 Explanation: The subarray [1] has the largest sum 1. */
  @Test
  void when_test_case_2_then_call_maxSubArraySum() throws InvalidAlgorithmParameterException {
    int[] nums = {1};
    assertEquals(1, maximumSubArraySum.maxSubArraySum(nums));
  }

  /**
   * Input: nums = [5,4,-1,7,8] Output: 23 Explanation: The subarray [5,4,-1,7,8] has the largest
   * sum 23.
   */
  @Test
  void when_test_case_3_then_call_maxSubArraySum() throws InvalidAlgorithmParameterException {
    int[] nums = {5, 4, -1, 7, 8};
    assertEquals(23, maximumSubArraySum.maxSubArraySum(nums));
  }

  @Test
  void when_invalid_input_then_call_maxSubArraySum() {
    int[] nums = {};
    Throwable exception =
        assertThrows(
            InvalidAlgorithmParameterException.class,
            () -> maximumSubArraySum.maxSubArraySum(nums));
    assertEquals("Array must have at least one items", exception.getMessage());
  }
}
