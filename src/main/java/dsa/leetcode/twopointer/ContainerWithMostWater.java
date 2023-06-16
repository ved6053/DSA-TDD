package dsa.leetcode.twopointer;

import java.security.InvalidAlgorithmParameterException;

/** https://leetcode.com/problems/container-with-most-water/ */
public class ContainerWithMostWater {
  public int maxCapacityOfWaterContainer(int[] heightOfWall)
      throws InvalidAlgorithmParameterException {
    int numOfWall = heightOfWall.length;
    int width = numOfWall - 1;
    if (width < 1) {
      throw new InvalidAlgorithmParameterException("Number of pillar is less than two's");
    }

    int leftIndex = 0;
    int rightIndex = numOfWall - 1;
    int result = 0;

    while (width > 0) {
      int leftWall = heightOfWall[leftIndex];
      int rightWall = heightOfWall[rightIndex];

      result = Math.max(result, width * Math.min(leftWall, rightWall));
      boolean isShiftLeftWall = leftWall <= rightWall;
      int minIndex = isShiftLeftWall ? leftIndex : rightIndex;
      int minHeightPillar = isShiftLeftWall ? leftWall : rightWall;

      while (width > 0 && heightOfWall[minIndex] <= minHeightPillar) {
        if (isShiftLeftWall) {
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
