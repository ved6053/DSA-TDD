package dsa.algoexpert.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class P002ValidateSubsequenceTest {
  P002ValidateSubsequence obj = new P002ValidateSubsequence();

  @Test
  void testCase1() {
    Integer[] array = {5, 1, 22, 25, 6, -1, 8, 10};
    Integer[] sequence = {1, 6, -1, 10};
    assertTrue(obj.isValidSubsequence(Arrays.asList(array), Arrays.asList(sequence)));
  }

  @Test
  void testCase13() {
    Integer[] array = {5, 1, 22, 25, 6, -1, 8, 10};
    Integer[] sequence = {5, 1, 22, 22, 25, 6, -1, 8, 10};
    assertFalse(obj.isValidSubsequence(Arrays.asList(array), Arrays.asList(sequence)));
  }
}
