package interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Coforge2Test {
  private final Coforge2 test = new Coforge2();

  @Test
  void maxArea() {
    int[] heightOfWalls = {1, 8, 6, 6, 2, 5, 9, 7, 8};
    // width =8, 0 , 8 area= 8*1
    //   1, 8 area= 7*8 = 56
    assertEquals(56, test.maxArea(heightOfWalls));
  }
}
