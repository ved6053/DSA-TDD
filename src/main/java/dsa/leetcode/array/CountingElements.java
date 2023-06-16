package dsa.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/** https://leetcode.ca/2019-10-26-1426-Counting-Elements/ */
public class CountingElements {

  public int countingElements(int[] arr) {
    Map<Integer, Integer> hashMap = new HashMap<>();
    for (Integer element : arr) {
      hashMap.put(element, hashMap.getOrDefault(element, 0) + 1);
    }
    int res = 0;
    for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
      if (hashMap.containsKey(entry.getKey() + 1)) {
        res += entry.getValue();
      }
    }

    return res;
  }
}
