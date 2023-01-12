
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 https://leetcode.com/problems/contains-duplicate
 */
import java.util.*;

class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i]))
        return true;
      else {
        set.add(nums[i]);
      }
    }
    return false;
  }
}