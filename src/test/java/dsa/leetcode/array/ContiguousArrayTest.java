package dsa.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContiguousArrayTest {
	private final ContiguousArray obj = new ContiguousArray();
	
	@Test
	void testCase1(){
		int[] array ={0, 1};
		assertEquals(2, obj.findMaxLength(array));
	}

	@Test
	void testCase2(){
		int[] array ={1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1};
		assertEquals(6, obj.findMaxLength(array));
	}

	@Test
	void testCase3(){
		int[] array ={1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1};
		assertEquals(4, obj.findMaxLength(array));
	}
}
