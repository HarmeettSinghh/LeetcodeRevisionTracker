# Subsets

**Difficulty:** Medium
**Language:** plaintext
**Runtime:** N/A
**Memory:** N/A
**Submission Date:** Aug 27, 2026, 9:23 PM
**Problem URL:** [https://leetcode.com/problems/subsets/](https://leetcode.com/problems/subsets/)

---

## Problem Statement

Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:

Input: nums = [0]
Output: [[],[0]]

Constraints:

- 1 <= nums.length <= 10

- -10 <= nums[i] <= 10

- All the numbers of nums are unique.

---

## Examples

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Input: nums = [0]
Output: [[],[0]]

---

## Constraints

_Not available._

---

## My Solution

```plaintext
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        subs(nums , 0, list,result );
        return result;
    }  
    public void subs(int[]nums , int index , ArrayList<Integer> list, List<List<Integer>> result ){
        if(index == nums.length){
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[index]);
        subs(nums, index+1, list , result);
        list.remove(list.size()-1);
        subs(nums,index+1 ,list, result);
    }

}
```
