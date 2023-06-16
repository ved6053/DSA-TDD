package dsa.narshima.karumanchi;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  public void helloWord() {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.helloWord();
    assertEquals("HelloWorld", outputStreamCaptor.toString().trim());
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }
}
