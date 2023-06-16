package dsa.leetcode.array;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * https://www.youtube.com/watch?v=_CqND7nPK-g&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=18
 * https://leetcode.com/problems/last-stone-weight/
 */
public class LastStoneWeight {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

    for (int i = 0; i < stones.length; i++) {
      queue.add(stones[i]);
    }
    Integer result = 0;
    while (!queue.isEmpty()) {
      int y = queue.remove();
      if (queue.isEmpty()) {
        return y;
      }
      int x = queue.remove();
      result = y - x;
      if (result > 0) {
        queue.add(result);
      }
    }
    return result;
  }
}
