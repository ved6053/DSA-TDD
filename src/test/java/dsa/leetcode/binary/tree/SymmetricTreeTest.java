package dsa.leetcode.binary.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {
  private static SymmetricTree symmetricTree;
  private Node root;

  @BeforeAll
  static void setup() {
    symmetricTree = new SymmetricTree();
  }

  /**
   * Input: root = [1,2,2,3,4,4,3,null,6,null,null,null, null,6, null] Output: true 1 / \ 2 2 / \ /
   * \ 3 4 4 3 \ / 6 6
   */
  @Test
  void when_test_case1_then_call_isSymmetric() {
    Node root =
        Node.buildTree(
            new Integer[] {1, 2, 2, 3, 4, 4, 3, null, 6, null, null, null, null, 6, null});
    assertTrue(symmetricTree.isSymmetric(root));
  }

  /** Input: root = [1,2,2,null,3,null,3] Output: false 1 / \ 2 2 \ \ 3 3 */
  @Test
  void when_test_case2_then_call_isSymmetric() {
    Node root = Node.buildTree(new Integer[] {1, 2, 2, null, 3, null, 3});
    assertFalse(symmetricTree.isSymmetric(root));
  }
}
