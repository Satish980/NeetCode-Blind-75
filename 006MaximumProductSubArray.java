/*
 Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

https://leetcode.com/problems/maximum-product-subarray/description/
 */

class Solution {
  public int maxProduct(int[] nums) {
      if (nums.length == 1) return nums[0];

      int res = nums[0];
      int max = 1;
      int min = 1;

      for (int n : nums) {
          int tmp = max * n;
          max = Math.max(n, Math.max(tmp, min * n));
          min = Math.min(n, Math.min(tmp, min * n));
          res = Math.max(res, max);
      }
      return res;
  }
}