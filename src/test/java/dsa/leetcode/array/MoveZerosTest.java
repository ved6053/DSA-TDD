package dsa.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MoveZerosTest {
  private static MoveZeros moveZeros;

  @BeforeAll
  static void setMoveZeros() {
    moveZeros = new MoveZeros();
  }

  @Test
  /** Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] */
  void whenTestCase1_then_moveZeros() {
    int[] nums = {0, 1, 0, 3, 12};
    int[] expectedArray = {1, 3, 12, 0, 0};
    assertArrayEquals(expectedArray, moveZeros.moveZeros(nums));
  }
}
