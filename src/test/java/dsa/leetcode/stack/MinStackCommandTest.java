package dsa.leetcode.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinStackCommandTest {

  private final MinStackCommand obj = new MinStackCommand();
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  void testCase1() {
    String[] commands = {"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"};
    Integer[] inputs = {null, -2, 0, -3, null, null, null, null};
    Integer[] result = new Integer[inputs.length];
    for (int i = 0; i < commands.length; i++) {
      result[i] = obj.command(commands[i], inputs[i]);
    }
    System.out.println(Arrays.toString(result));
    assertEquals("[null, null, null, null, -3, -3, 0, -2]", outputStreamCaptor.toString().trim());
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }
}
