package dsa.leetcode.twopointer;

import java.security.InvalidAlgorithmParameterException;

/** https://leetcode.com/problems/container-with-most-water/ */
public class ContainerWithMostWater {

  public int maxCapacityOfWaterContainer(int[] heightOfPillars)
      throws InvalidAlgorithmParameterException {
    int numOfPillar = heightOfPillars.length;
    int width = numOfPillar - 1;
    if (width < 1) {
      throw new InvalidAlgorithmParameterException("Number of pillar is less than two's");
    }

    int leftIndex = 0;
    int rightIndex = numOfPillar - 1;
    int result = 0;

    while (width > 0) {
      int leftPillar = heightOfPillars[leftIndex];
      int rightPillar = heightOfPillars[rightIndex];

      result = Math.max(result, width * Math.min(leftPillar, rightPillar));
      boolean hasShiftLeftPillar = leftPillar <= rightPillar;
      int minIndex = hasShiftLeftPillar ? leftIndex : rightIndex;
      int minHeightPillar = hasShiftLeftPillar? leftPillar : rightPillar;
      
      while (width > 0 && heightOfPillars[minIndex] <= minHeightPillar) {
        if (hasShiftLeftPillar) {
          minIndex++;
          leftIndex++;
        } else {
          minIndex--;
          rightIndex--;
        }
        width--;
      }
    }
    return result;
  }
}
