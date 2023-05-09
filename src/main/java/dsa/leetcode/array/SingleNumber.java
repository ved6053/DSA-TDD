package dsa.leetcode.array;

public class SingleNumber {

  public int findOddWithTwoRepeat(int[] arr) {
    int res = 0;
    for (int item : arr) {
      res ^= item;
    }
    return res;
  }

  public int findOddWithThreeRepeat(int[] arr) {
    int[] bitMap = new int[32];
    for (int i = 0; i < 32; i++) {
      for (int item : arr) {
        if (((item >> i) & 1) > 0) {
          bitMap[i] = (bitMap[i] + 1) % 3;
        }
      }
    }
    int res = 0;
    for (int i = 0; i < 32; i++) {
      res = res | (bitMap[i] << i);
    }
    return res;
  }
}
