package dsa.leetcode.array;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 */
public class BestTimeToBuyAndSellStock {
  public int maxProfitOnDailySell(int[] arr) {
    int len = arr.length;
    int buy = arr[0], profit = 0;
    for (int i = 1; i < len; i++) {
      if (arr[i-1] > arr[i]) {
        profit +=  arr[i - 1]-buy;
        buy = arr[i];
      }
    }
    return profit;
  }
  public int maxProfitOnSingleDaySell(int[] arr){
    int len = arr.length;
    int l=0, r=len-1;
    int buy = arr[0], sell = arr[r];
    l++;
    r--;
    while(l<r){
      if(buy>arr[l])
        buy=arr[l];
      if(sell<arr[r])
        sell=arr[r];
      l++;
      r--;
    }
    return  sell-buy;
  }
}
