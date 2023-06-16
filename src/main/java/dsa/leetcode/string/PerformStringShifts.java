package dsa.leetcode.string;
/**
 * https://leetcode.ca/all/1427.html
 * https://www.youtube.com/watch?v=mU0Uin1vBGg&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=20
 */
public class PerformStringShifts {
  public String performStringShifts(String str, int[][] shifts) {
    String result = "";
    int left = 0, right = 0;
    int n = str.length();
    for (int[] shift : shifts) {
      if (shift[0] == 0) {
        left += shift[1];
      } else {
        right += shift[1];
      }
    }
    if (left > right) {
      left -= right;
      left %= n;
      result += str.substring(left, n);
      result += str.substring(0, left);
    } else {
      right -= left;
      right %= n;
      result += str.substring(n - right, n);
      result += str.substring(0, n - right);
    }
    return result;
  }
}
