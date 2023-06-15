package dsa.leetcode.binary.tree;

/**
 * https://www.youtube.com/watch?v=mWyhPJ1Ukvw&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=17
 * https://leetcode.com/problems/diameter-of-binary-tree/
 **/
public class DiameterOfBinaryTree {
	public int diameterOfBinaryTree(Node root) {
		if(root==null){
			return 0;
		}
		return heightOfBinaryTree(root.left)+heightOfBinaryTree(root.right);
	}

	public int heightOfBinaryTree(Node root){
		if(root==null){
			return 0;
		}
		return 1+Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right));
	}
}
