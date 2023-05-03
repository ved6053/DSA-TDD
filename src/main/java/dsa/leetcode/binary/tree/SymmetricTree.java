package dsa.leetcode.binary.tree;

public class SymmetricTree {
	public boolean isSymmetric( Node root){
		if(root==null||(root.left==null&&root.right==null))
			return true;
		else
			return isMirror(root.left,root.right);
	}

	private boolean isMirror( Node l, Node r){
		if(l==null&&r==null)
			return true;
		else if(l==null || r==null)
			return false;
		else return l.data == r.data && isMirror(l.left, r.right) && isMirror(l.right, r.left);
	}
}
