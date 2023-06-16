package dsa.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

class Node {
  public int val;

  public List<Node> neighbors;

  public Node() {
    val = 0;
    neighbors = new ArrayList<Node>();
  }

  public Node(int val) {
    this.val = val;
    neighbors = new ArrayList<Node>();
  }

  public Node(int val, ArrayList<Node> neighbors) {
    this.val = val;
    this.neighbors = neighbors;
  }

  public static Node makeGraph(int[][] adjList) {
    Node[] nodes = new Node[adjList.length];
    for (int i = 0; i < adjList.length; i++) {
      if (nodes[i] == null) {
        nodes[i] = new Node(i + 1);
      }

      for (int j = 0; j < adjList[i].length; j++) {
        int neighbourIndex = adjList[i][j] - 1;
        if (nodes[neighbourIndex] == null) {
          nodes[neighbourIndex] = new Node(adjList[i][j]);
        }
        nodes[i].neighbors.add(nodes[neighbourIndex]);
      }
    }
    return nodes[0];
  }
}
