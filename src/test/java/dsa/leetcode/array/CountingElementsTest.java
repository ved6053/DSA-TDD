package dsa.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CountingElementsTest {
  private static CountingElements countingElements;

  @BeforeAll
  public static void setCountingElements() {
    countingElements = new CountingElements();
  }

  @Test
  /**
   * Input: arr = [1,3,2,3,5,0]
   *
   * Output: 3
   *
   * Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
   **/
  void whenTestCase1_then_callCountingElements() {
    int[] arr = {1,3,2,3,5,0};
    assertEquals(3,countingElements.countingElements(arr));
  }

  /**
   * Input: arr = [1,1,2,2]
   *
   * Output: 2
   *
   * Explanation: Two 1s are counted cause 2 is in arr.
   **/
  @Test
  void whenTestCase2_then_callCountingElements() {
    int[] arr = {1,1,2,2};
    assertEquals(2,countingElements.countingElements(arr));
  }

  /**
   * Input: arr = [1,1,2]
   *
   * Output: 2
   *
   * Explanation: Both 1s are counted because 2 is in the array.
   **/
  @Test
  void whenTestCase3_then_callCountingElements() {
    int[] arr = {1,1,2};
    assertEquals(2,countingElements.countingElements(arr));
  }

  /**
   * Input: arr = [1,1,3,3,5,5,7,7]
   *
   * Output: 0
   *
   * Explanation: No numbers are counted, cause there’s no 2, 4, 6, or 8 in arr.
   **/
  @Test
  void whenTestCase4_then_callCountingElements() {
    int[] arr = {1,1,3,3,5,5,7,7};
    assertEquals(0,countingElements.countingElements(arr));
  }
}
