package dsa.leetcode.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidAlgorithmParameterException;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

  @Test
  /**
   * Input: height = [1,8,6,2,5,4,8,3,7] Output: 49 Explanation: The above vertical lines are
   * represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section)
   * the container can contain is 49.
   */
  @Description("Test with valid input")
  void find_maxCapacityOfWaterContainer() throws InvalidAlgorithmParameterException {
    int[] heightOfPillars = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
    assertEquals(49, containerWithMostWater.maxCapacityOfWaterContainer(heightOfPillars));
  }

  @Test
  @Description("Edge case")
  void whenPillarSize_less_than_2_then_find_maxCapacityOfWaterContainer() {
    int[] heightOfPillars = {1};
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
    Throwable exception =
        assertThrows(
            InvalidAlgorithmParameterException.class,
            () -> containerWithMostWater.maxCapacityOfWaterContainer(heightOfPillars));
    assertEquals("Number of pillar is less than two's", exception.getMessage());
  }

  @Test
  void whenTestCase3_then_callMaxArea() throws InvalidAlgorithmParameterException {
    int[] heightOfWalls = {1, 8, 6, 6, 2, 5, 9, 7, 8};
    // width =8, 0 , 8 area= 8*1
    //   1, 8 area= 7*8 = 56
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
    assertEquals(56, containerWithMostWater.maxCapacityOfWaterContainer(heightOfWalls));
  }
}
