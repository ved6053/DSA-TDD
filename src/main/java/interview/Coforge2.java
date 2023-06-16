package interview;

public class Coforge2 {

  /**
   * max amount of water contian with between wall same , area wall is negilible vol dis front +
   * back =fix area height*dis= area;
   *
   * <p>| | | | | | | | | | | | | | | height[] ={1, 8, 6, 6, 2, 5, 9, 7, 8} leftIndex rightIndex
   * maxium area width = 8 area=8*1= 8 area = 6*5= 30
   */
  int maxArea(int[] heightOfWall) {
    int numOfWall = heightOfWall.length;
    int width = numOfWall - 1;
    if (width < 1) {
      return -1;
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
