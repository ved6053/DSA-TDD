package dsa.leetcode.binary.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiameterOfBinaryTreeTest {
	private final DiameterOfBinaryTree obj=new DiameterOfBinaryTree();
	  /**
	   * Input: root = [1,2,3,4,5]
	   * Output: 3
	   * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
	   *            1
	   *           / \
	   *          2   3
	   *         / \
	   *        4   5
	   **/
	  @Test
	  void testCase1(){
		  Node root = Node.buildTree(new Integer[]{1,2,3,4,5});
		  assertEquals(3, obj.diameterOfBinaryTree(root));
	  }

	/**
	 *Input: root = [1,2,2,3,4,4,3,null,6,null,null,null, null,6, null]
	 *Output: true
	 *           1
	 *        /    \
	 *       2      2
	 *     /  \   /  \
	 *    3    4 4   3
	 *     \         /
	 *      6       6
	 */
	@Test
	void testCase2() {
		Node root = Node.buildTree(new Integer[]{1,2,2,3,4,4,3,null,6,null,null,null, null,6, null});
		assertEquals(6, obj.diameterOfBinaryTree(root));
	}
	
	/**
	 *Input: root = [1,2,2,null,3,null,3]
	 *Output: false
	 *          1
	 *        /   \
	 *       2     2
	 *        \     \
	 *         3     3
	 *
	 */
	@Test
	void testCase3() {
		Node root = Node.buildTree(new Integer[]{1,2,2,null,3,null,3});
		assertEquals(4, obj.diameterOfBinaryTree(root));
	}
	/**
	 * root= [4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
	 * diameter = 6
	 **/
	@Test
	void testCase4(){
		Node root= Node.buildTree(new Integer[]{4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2});
		assertEquals(6, obj.diameterOfBinaryTree(root));
		
	}
}
