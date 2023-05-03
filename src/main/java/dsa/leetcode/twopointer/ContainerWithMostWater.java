package dsa.leetcode.twopointer;

import java.security.InvalidAlgorithmParameterException;

/** https://leetcode.com/problems/container-with-most-water/ */
public class ContainerWithMostWater {

  public int maxCapacityOfWaterContainer(int[] heightOfPillars) throws InvalidAlgorithmParameterException {
    int numOfPillar = heightOfPillars.length;
    int width = numOfPillar - 1;
    if (width < 1) {
      throw new InvalidAlgorithmParameterException("Number of pillar is less than two's");
    }
    
    int leftMaxIndex = 0;
    int rightMaxIndex = numOfPillar - 1;
    int result = 0;
    
    while (width>0) {
      int leftMaxHeightPillar = heightOfPillars[leftMaxIndex];
      int rightMaxHeightPillar = heightOfPillars[rightMaxIndex];
      
      result = Math.max(result, width *  Math.min(leftMaxHeightPillar, rightMaxHeightPillar));
      
      int minIndex = leftMaxHeightPillar <rightMaxHeightPillar ? leftMaxIndex:rightMaxIndex;
      int maxHeightPillar = leftMaxHeightPillar>rightMaxHeightPillar?leftMaxHeightPillar:rightMaxHeightPillar;
      
      while (width>0 && heightOfPillars[minIndex] <= maxHeightPillar) {
        if(leftMaxHeightPillar!=maxHeightPillar) {
          minIndex++;
          leftMaxIndex++;
        }else {
          minIndex--;
          rightMaxIndex--;
        }
        width--;
      }
    }
    return result;
  }
}
