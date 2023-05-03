package dsa.leetcode.twopointer;

import java.security.InvalidAlgorithmParameterException;

/** https://leetcode.com/problems/container-with-most-water/ */
public class ContainerWithMostWater {

  public int findContainerWithMostWater(int[] heightOfPillars) throws InvalidAlgorithmParameterException {
    int numOfPillar = heightOfPillars.length;
    int width = numOfPillar - 1;
    if (width < 1) {
      throw new InvalidAlgorithmParameterException("Number of pillar is less than two's");
    }
    int leftMaxPillar = heightOfPillars[0];
    int rightMaxPillar = heightOfPillars[numOfPillar-1];

    int leftIndex = 0;
    int rightIndex = numOfPillar - 1;
    int result = 0;
    while (leftIndex < numOfPillar && rightIndex >= 0 && leftIndex < rightIndex) {
      int minHeight = Math.min(leftMaxPillar, rightMaxPillar);
      result = Math.max(result, width * minHeight);
      if (leftMaxPillar < rightMaxPillar) {
        while (leftIndex < numOfPillar && heightOfPillars[leftIndex] <= rightMaxPillar) {
          width--;
          leftIndex++;
        }
      } else {
        while (rightIndex >= 0 && heightOfPillars[rightIndex] <= leftMaxPillar) {
          width--;
          rightIndex--;
        }
      }
      if (leftIndex < numOfPillar && rightIndex >= 0) {
        leftMaxPillar = heightOfPillars[leftIndex];
        rightMaxPillar = heightOfPillars[rightIndex];
      }
    }
    return result;
  }
}
