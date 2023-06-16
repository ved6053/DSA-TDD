package dsa.leetcode.binary.tree;

public class Node {
  public int data;
  public Node left;

  public Node right;

  public Node(int data) {
    this.data = data;
  }

  public static Node buildTree(Integer[] arr) {
    Node[] nodeArray = new Node[arr.length];
    for (int i = 0; i < arr.length; i++) {
      nodeArray[i] = arr[i] != null ? new Node(arr[i]) : null;
    }

    for (int i = 0; i < nodeArray.length; i++) {
      if (2 * i + 1 < nodeArray.length && nodeArray[i] != null) {
        nodeArray[i].left = nodeArray[2 * i + 1];
      }
      if (2 * i + 2 < nodeArray.length && nodeArray[i] != null) {
        nodeArray[i].right = nodeArray[2 * i + 2];
      }
    }
    return nodeArray[0];
  }
}
