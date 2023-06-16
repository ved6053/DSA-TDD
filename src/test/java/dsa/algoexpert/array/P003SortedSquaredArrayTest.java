package dsa.algoexpert.array;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class P003SortedSquaredArrayTest {

  private final P003SortedSquaredArray obj = new P003SortedSquaredArray();
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void testCase1() {
    int[] array = {-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};
    assertEquals(
        "[0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500]",
        Arrays.toString(obj.sortedSquaredArray(array)).trim());
  }
}
