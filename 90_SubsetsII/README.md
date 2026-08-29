# Subsets II

**Difficulty:** Medium
**Language:** java
**Runtime:** 2 (beats 99.73%)
**Memory:** 44900000 (beats 88.96%)
**Submission Date:** Aug 29, 2026, 7:06 PM
**Problem URL:** [https://leetcode.com/problems/subsets-ii/](https://leetcode.com/problems/subsets-ii/)

---

## Problem Statement

Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]

Constraints:

- 1 <= nums.length <= 10

- -10 <= nums[i] <= 10

---

## Examples

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

Input: nums = [0]
Output: [[],[0]]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subs(0, nums,list , result);
        return result;
    }
    public void subs(int i ,int[]nums, List<Integer> list ,  List<List<Integer>> result){
        int n = nums.length;
        if(i==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        subs(i+1,nums , list , result);
        list.remove(list.size()-1);
        i= i+1;
        while(i<n && nums[i] == nums[i-1]){
            i++;
        }
        subs(i,nums,list, result);
    }
}
```
