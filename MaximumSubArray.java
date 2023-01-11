/*
Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 https://leetcode.com/problems/maximum-subarray/

 sliding window
 */
class Solution {
  public int maxSubArray(int[] nums) {
      int currSum = 0, maxSub = nums[0];
      for(int n:nums){
          if(currSum<0)
              currSum = 0;
          currSum+=n;
          maxSub = Math.max(maxSub, currSum);
      }
      return maxSub;
  }
}