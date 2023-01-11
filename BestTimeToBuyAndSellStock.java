/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */

// solution - 1
// class Solution {
//   public int maxProfit(int[] prices) {
//     int min = prices[0], ans = 0;
//     for (int i = 1; i < prices.length; i++) {
//       int currentPrice = prices[i] - min;
//       if (currentPrice > ans)
//         ans = currentPrice;
//       min = Math.min(min, prices[i]);
//     }
//     return ans;
//   }
// }

// solution - 2 two pointer approach
class Solution {
  public int maxProfit(int[] prices) {
    int cP = 0, l = 0, r = 1, mP = 0; // l - buy, r - sell
    // cP - currentProfit, mP - maxProfit
    while (r < prices.length) {
      if (prices[l] < prices[r]) {
        cP = prices[r] - prices[l];
        mP = Math.max(cP, mP);
      } else {
        l = r; // new best stock
      }
      r++;
    }
    return mP;
  }
}
