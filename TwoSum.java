/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
https://leetcode.com/problems/two-sum/
 */

// brute force
// import java.util.*;
// class Solution {

//     public int[] twoSum(int[] nums, int target) {
//         int[] a = new int[2];

//         for (int i=0;i<nums.length;i++)
//          for(int j=1;j<nums.length;j++)
//             if((nums[i]+nums[j] == target) && i!=j)
//             {
//                 a[0] = i;
//                 a[1] = j;
//             }
//         return a;
//     }
// }

// optimal
import java.util.Map;
import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (hashMap.containsKey(diff))
        return new int[] { hashMap.get(diff), i };
      else
        hashMap.put(nums[i], i);
    }
    return new int[] {};
  }
}