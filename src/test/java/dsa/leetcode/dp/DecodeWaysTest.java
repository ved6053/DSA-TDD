package dsa.leetcode.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

class DecodeWaysTest {
	private  DecodeWays decodeWays;
	@Nested
	@TestInstance (TestInstance.Lifecycle.PER_CLASS)
	class Recursion {

		
		@BeforeAll
		 void setDecodeWays(){
			decodeWays = new DecodeWays(Algo.REC);
		}
		
		@Test
		/**
		 * Input: s = "12"
		 * Output: 2
		 * Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
		 **/
		void when_test_case1_then_decodeWays() {
			assertEquals(2, decodeWays.decodeWays("12"));
		}
		
		/**
		 * Input: s = "226"
		 * Output: 3
		 * Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
		 **/
		@Test
		void when_test_case2_then_decodeWays() {
			assertEquals(3, decodeWays.decodeWays("226"));
		}
		
		@Test
		/**
		 * Input: s = "06"
		 * Output: 0
		 * Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
		 **/
		void when_test_case3_then_decodeWays() {
			assertEquals(0, decodeWays.decodeWays("06"));
		}
	}

	@Nested
	@TestInstance (TestInstance.Lifecycle.PER_CLASS)
	class DP {
		
		@BeforeAll
		void setDecodeWays(){
			decodeWays = new DecodeWays(Algo.DP);
		}
		
		@Test
		/**
		 * Input: s = "12"
		 * Output: 2
		 * Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
		 **/
		void when_test_case1_then_decodeWays() {
			assertEquals(2, decodeWays.decodeWays("12"));
		}
		
		/**
		 * Input: s = "226"
		 * Output: 3
		 * Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
		 **/
		@Test
		void when_test_case2_then_decodeWays() {
			assertEquals(3, decodeWays.decodeWays("226"));
		}
		
		@Test
		/**
		 * Input: s = "06"
		 * Output: 0
		 * Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
		 **/
		void when_test_case3_then_decodeWays() {
			assertEquals(0, decodeWays.decodeWays("06"));
		}
	}
	
}
