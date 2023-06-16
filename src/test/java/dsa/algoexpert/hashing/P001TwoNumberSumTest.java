package dsa.algoexpert.hashing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class P001TwoNumberSumTest {
  P001TwoNumberSum obj = new P001TwoNumberSum();

  @Test
  void testCase1() {
    int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
    int targetSum = 10;
    Arrays.equals(new int[] {11, -1}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase2() {
    int[] array = {4, 6};
    int targetSum = 10;
    Arrays.equals(new int[] {4, 6}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase3() {
    int[] array = {4, 6, 1};
    int targetSum = 5;
    Arrays.equals(new int[] {4, 1}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase4() {
    int[] array = {4, 6, 1, -3};
    int targetSum = 3;
    Arrays.equals(new int[] {6, -3}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase5() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int targetSum = 17;
    Arrays.equals(new int[] {8, 9}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase6() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
    int targetSum = 18;
    Arrays.equals(new int[] {3, 15}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase7() {
    int[] array = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
    int targetSum = -5;
    Arrays.equals(new int[] {-5, 0}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase8() {
    int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
    int targetSum = 163;
    Arrays.equals(new int[] {210, -47}, obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase9() {
    int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
    int targetSum = 164;
    Arrays.equals(new int[0], obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase10() {
    int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
    int targetSum = 15;
    Arrays.equals(new int[0], obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase11() {
    int[] array = {14};
    int targetSum = 15;
    Arrays.equals(new int[0], obj.twoNumberSum(array, targetSum));
  }

  @Test
  void testCase12() {
    int[] array = {15};
    int targetSum = 15;
    Arrays.equals(new int[0], obj.twoNumberSum(array, targetSum));
  }
}
