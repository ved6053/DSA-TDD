package dsa.leetcode.dp;

/** https://leetcode.com/problems/decode-ways/ */
public class DecodeWays {
  private final Algo algo;

  public DecodeWays(Algo algo) {
    this.algo = algo;
  }

  private int decodeWaysRecursiveSolution(int[] arr, int i) {
    if (arr[0] == 0 || arr.length <= 0) {
      return 0;
    }

    if (i <= 0) {
      return 1;
    }
    if (arr[i] == 0 || arr[i - 1] * 10 + arr[i] > 26) {
      return decodeWaysRecursiveSolution(arr, i - 1);
    }
    return decodeWaysRecursiveSolution(arr, i - 1) + decodeWaysRecursiveSolution(arr, i - 2);
  }

  private int decodeWaysDP(int[] arr) {
    int len = arr.length;
    if (arr[0] == 0 || arr.length <= 0) {
      return 0;
    }

    int res1 = 1;
    int res2 = 1;
    for (int i = 1; i < len; i++) {
      if (arr[i] == 0 || arr[i - 1] * 10 + arr[i] > 26) {
        res2 = res1;
      } else {
        int temp = res2 + res1;
        res1 = res2;
        res2 = temp;
      }
    }
    return res2;
  }

  public int decodeWays(String arr) {
    int[] nums = new int[arr.length()];
    int i = 0;
    for (int e : arr.toCharArray()) {
      nums[i++] = e - '0';
    }
    switch (algo) {
      case REC:
        return decodeWaysRecursiveSolution(nums, arr.length() - 1);
      case DP:
        return decodeWaysDP(nums);
      default:
        return -1;
    }
  }
}
