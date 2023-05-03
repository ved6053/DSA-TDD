package dsa.leetcode.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidAlgorithmParameterException;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {


  @Test
  /**
   * Input: height = [1,8,6,2,5,4,8,3,7]
   * Output: 49
   * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
   */
  @Description("Test with valid input")
  void findContainerWithMostWater() throws InvalidAlgorithmParameterException {
	  int[] heightOfPillars = {1,8,6,2,5,4,8,3,7};
	  ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
	  assertEquals(49,containerWithMostWater.findContainerWithMostWater(heightOfPillars) );
  }
  
  @Test
  @Description("Edge case")
  void  whenPillarSize_less_than_2_then_findContainerWithMostWater()   {
	  int[] heightOfPillars = {1};
	  ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
	  Throwable exception = assertThrows(InvalidAlgorithmParameterException.class, () ->containerWithMostWater.findContainerWithMostWater(heightOfPillars));
	  assertEquals("Number of pillar is less than two's", exception.getMessage());
	 
  }
}
