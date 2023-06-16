package dsa.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {
  private final ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  void testCase1() {
    int[] array = {-1, 1, 0, -3, 3};
    int[] res = obj.productExceptSelf(array);
    System.out.println(Arrays.toString(res));
    // [0, 0, 9, 0, 0]
    assertEquals("[0, 0, 9, 0, 0]", outputStreamCaptor.toString().trim());
  }

  @Test
  void testCase2() {
    int[] array = {1, 2, 3, 4};
    int[] res = obj.productExceptSelf(array);
    System.out.println(Arrays.toString(res));
    // [24, 12, 8, 6]
    assertEquals("[24, 12, 8, 6]", outputStreamCaptor.toString().trim());
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }
}
