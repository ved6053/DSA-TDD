package dsa.leetcode.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PerformStringShiftsTest {
	private final PerformStringShifts obj = new PerformStringShifts();

  /**
   * Input: s = "abc", shift = [[0,1],[1,2]]
   * Output: "cab"
   * Explanation:
   * [0,1] means shift to left by 1. "abc" -> "bca"
   * [1,2] means shift to right by 2. "bca" -> "cab"
   **/
  @Test
  void testCase1() {
	 String s = "abc";
	 int[][] shift = {{0,1},{1,2}};
	 assertEquals("cab", obj.performStringShifts(s, shift));
  }

  /**
   * Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
   * Output: "efgabcd"
   * Explanation:
   * [1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
   * [1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
   * [0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
   * [1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
   **/
  @Test
  void testCase2() {
	  String s = "abcdefg";
	  int[][]shift = {{1,1},{1,1},{0,2},{1,3}};
	  assertEquals("efgabcd", obj.performStringShifts(s, shift));
  }
}
