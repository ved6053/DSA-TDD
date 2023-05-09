package dsa.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SingleNumberTest {
  private static SingleNumber singleNumber;
  
  @BeforeAll
  static void setup(){
	  singleNumber = new SingleNumber();
  }
  @Test
  /**
   * Input: nums = [4,1,2,1,2]
   * Output: 4
   **/
  void when_testcase1_then_findOddWithTwoRepeat() {
	  int[] nums = {4,1,2,1,2};
	  assertEquals(4, singleNumber.findOddWithTwoRepeat(nums));
  }

  @Test
  /**
   * Input: nums = [2,2,1]
   * Output: 1
   **/
  void when_testcase2_then_findOddWithTwoRepeat() {
		int[] nums = {2,2,1};
		assertEquals(1, singleNumber.findOddWithTwoRepeat(nums));
	}

	@Test
	/**
	 * Input: nums = [1]
	 * Output: 1
	 **/
	void when_testcase3_then_findOddWithTwoRepeat() {
		int[] nums = {1};
		assertEquals(1, singleNumber.findOddWithTwoRepeat(nums));
	}

  @Test
  /**
   * Input: nums = [0,1,0,1,0,1,99]
   * Output: 99
   **/
  void when_testcase1_then_findOddWithThreeRepeat() {
		int[] nums = {0,1,0,1,0,1,99};
		assertEquals(99, singleNumber.findOddWithThreeRepeat(nums));
	}
}
