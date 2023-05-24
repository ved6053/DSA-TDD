package dsa.leetcode.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BackspaceStringCompareTest {
	private  BackspaceStringCompare backspaceStringCompare;
	@BeforeEach
	void setBackspaceStringCompare() {
		backspaceStringCompare = new BackspaceStringCompare();
	}

 
  /**
   * Input: s = "ab#c", t = "ad#c"
   * Output: true
   * Explanation: Both s and t become "ac".
   **/
  @Test
  void whenTestCase1_then_callBackspaceStringCompare() {
	  String  s = "ab#c", t = "ad#c";
	  assertTrue(backspaceStringCompare.backspaceCompare(s, t));
	}

  /**
   * Input: s = "ab##", t = "c#d#"
   * Output: true
   * Explanation: Both s and t become "".
   **/
  @Test
  void whenTestCase2_then_callBackspaceStringCompare() {
	  String  s = "ab##", t = "c#d#";
	  assertTrue(backspaceStringCompare.backspaceCompare(s, t));
  }

  /**
   * Input: s = "a#c", t = "b"
   * Output: false
   * Explanation: s becomes "c" while t becomes "b".
   **/
  @Test
  void whenTestCase3_then_callBackspaceStringCompare() {
	  String s = "a#c", t = "b";
	  assertFalse(backspaceStringCompare.backspaceCompare(s, t));
  }
}
