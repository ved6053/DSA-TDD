package dsa.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {
	BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
	  /**
	   * Input: prices = [7,1,5,3,6,4]
	   * Output: 7
	   * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
	   * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
	   * Total profit is 4 + 3 = 7.
	   **/
	  @Test
	  void when_test_case_1_then_call_maxProfitOnDailySell() {
		  int[] prices = {7,1,5,3,6,4};
		  assertEquals(7, bestTimeToBuyAndSellStock.maxProfitOnDailySell(prices));
	  }

  /**
   * Input: prices = [7,1,5,3,6,4]
   * Output: 5
   * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
   * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
   **/
  @Test
  void when_test_case_1_then_call_maxProfitOnSingleDaySell() {
		int[] prices = {7,1,5,3,6,4};
		assertEquals(5, bestTimeToBuyAndSellStock.maxProfitOnSingleDaySell(prices));
	}
}
