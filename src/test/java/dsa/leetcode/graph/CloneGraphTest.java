package dsa.leetcode.graph;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CloneGraphTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
  /**
   * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
   * Output: [[2,4],[1,3],[2,4],[1,3]]
   * Explanation: There are 4 nodes in the graph.
   * 1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
   * 2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
   * 3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
   * 4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
   **/
  @Test
  void when_test_case1_then_cloneGraph(){
	  int[][] adjList = {{2,4},{1,3},{2,4},{1,3}};
	  Node node = Node.makeGraph(adjList);
	  CloneGraph cloneGraph = new CloneGraph(adjList.length);
	  Node cloneNode = cloneGraph.clone(node);
	  cloneGraph.printClonedGraph(cloneNode);
	  assertEquals("[[2, 4][1, 3][2, 4][1, 3]]", outputStreamCaptor.toString()
			                             .trim());
    }

	@AfterEach
	public void restoreStreams() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
}
