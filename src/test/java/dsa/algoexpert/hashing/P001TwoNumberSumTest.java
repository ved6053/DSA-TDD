package dsa.algoexpert.hashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P001TwoNumberSumTest {
  P001TwoNumberSum obj = new P001TwoNumberSum();

  @Test
  void testCase1() {
    int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
	int targetSum = 10;
	int[] res = obj.twoNumberSum(array, targetSum);
    assertEquals(11, res[0]);
    assertEquals(-1, res[1]);
  }

  @Test
  void testCase2() {
      int[] array = {4, 6};
	  int targetSum = 10;
	  int[] res = obj.twoNumberSum(array, targetSum);
	  assertEquals(4, res[0]);
	  assertEquals(6, res[1]);
  }

  @Test
  void testCase3() {
    int[] array = {4, 6, 1};
	int targetSum = 5;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(4, res[0]);
	assertEquals(1, res[1]);
  }

  @Test
  void testCase4() {
    int[] array = {4, 6, 1, -3};
	int targetSum = 3;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(6, res[0]);
	assertEquals(-3, res[1]);
  }

  @Test
  void testCase5() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int targetSum = 17;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(8, res[0]);
	assertEquals(9, res[1]);
  }

  @Test
  void testCase6() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
	int targetSum = 18;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(3, res[0]);
	assertEquals(15, res[1]);
  }

  @Test
  void testCase7() {
    int[] array = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
	int targetSum = -5;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(-5, res[0]);
	assertEquals(0, res[1]);
  }

  @Test
  void testCase8() {
    int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
	int targetSum = 163;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(210, res[0]);
	assertEquals(-47, res[1]);
  }

  @Test
  void testCase9() {
    int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
	int targetSum = 164;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(0, res.length);
  }

  @Test
  void testCase10() {
    int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
	int targetSum = 15;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(0, res.length);
  }

  @Test
  void testCase11() {
    int[] array = {14};
	int targetSum = 15;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(0, res.length);
  }

  @Test
  void testCase12() {
    int[] array = {15};
	int targetSum = 15;
	int[] res = obj.twoNumberSum(array, targetSum);
	assertEquals(0, res.length);
  }
}
