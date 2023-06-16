package dsa.leetcode.binary.tree;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://www.youtube.com/watch?v=mWyhPJ1Ukvw&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=17
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {
  public int diameterOfBinaryTree(Node root) {
    if (root == null) {
      return 0;
    }
    return diameterOfBinaryTree(root, new AtomicInteger(0));
  }

  private int diameterOfBinaryTree(Node root, AtomicInteger height) {
    if (root == null) {
      return 0;
    }
    AtomicInteger h1 = new AtomicInteger(0), h2 = new AtomicInteger(0);
    int d1 = diameterOfBinaryTree(root.left, h1);
    int d2 = diameterOfBinaryTree(root.right, h2);
    height.set(1 + Math.max(h1.get(), h2.get()));
    return Math.max(h1.get() + h2.get(), Math.max(d1, d2));
  }
}
