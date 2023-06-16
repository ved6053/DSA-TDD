package dsa.leetcode.string;

import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 * https://www.youtube.com/watch?v=TfENDUMm0XE&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=14
 * https://www.youtube.com/watch?v=tUxW1JwEb9M&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=15
 */
public class BackspaceStringCompare {
  public Boolean backspaceCompare(String str1, String str2) {
    char[] s1 = str1.toCharArray();
    char[] s2 = str2.toCharArray();
    int i = s1.length - 1, j = s2.length - 1;
    while (i >= 0 || j >= 0) {
      int count = 0;
      while (i >= 0 && (count > 0 || s1[i] == '#')) {
        if (s1[i] == '#') count++;
        else count--;
        i--;
      }
      while (j >= 0 && (count > 0 || s2[j] == '#')) {
        if (s2[j] == '#') count++;
        else count--;
        j--;
      }
      if (i >= 0 && j >= 0) {
        if (s1[i] != s2[j]) return false;
        else {
          i--;
          j--;
        }
      } else if (i >= 0 || j >= 0) {
        return false;
      }
    }

    return true;
  }

  private String removeBackspace(String str) {
    Stack<Character> stack = new Stack<>();
    String result = "";
    for (Character ch : str.toCharArray()) {
      if (ch == '#') {
        if (!stack.empty()) stack.pop();
      } else {
        stack.push(ch);
      }
    }
    while (!stack.empty()) {
      result = stack.pop() + result;
    }
    return result;
  }
}
