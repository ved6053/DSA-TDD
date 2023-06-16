package dsa.leetcode.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** https://leetcode.com/problems/clone-graph/ */
public class CloneGraph {

  private final int[][] adjList;
  private final Map<Integer, Node> visited;
  private Node node;

  public CloneGraph(int size) {
    adjList = new int[size][];
    visited = new HashMap<>();
  }

  public Node clone(Node node) {
    Node newNode = new Node(node.val);
    visited.put(node.val, newNode);
    for (Node neighbour : node.neighbors) {
      Node cloneNeighbour;

      if (!visited.containsKey(neighbour.val)) {
        cloneNeighbour = clone(neighbour);
      } else {
        cloneNeighbour = visited.get(neighbour.val);
      }

      newNode.neighbors.add(cloneNeighbour);
    }

    return newNode;
  }

  public void visitNodeDFS(Node node) {
    if (adjList[node.val - 1] != null) return;
    adjList[node.val - 1] = new int[node.neighbors.size()];
    int i = 0;
    for (Node neighbor : node.neighbors) {
      adjList[node.val - 1][i++] = neighbor.val;
      visitNodeDFS(neighbor);
    }
  }

  public int[][] getAdjList(Node node) {
    visitNodeDFS(node);
    return adjList;
  }

  public void printClonedGraph(Node node) {
    int[][] adjList = getAdjList(node);
    System.out.print("[");
    for (int[] ints : adjList) {
      System.out.print(Arrays.toString(ints));
    }
    System.out.print("]");
  }
}
