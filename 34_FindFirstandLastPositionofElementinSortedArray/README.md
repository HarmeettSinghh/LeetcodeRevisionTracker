# Find First and Last Position of Element in Sorted Array

**Difficulty:** Medium
**Language:** java
**Runtime:** 0 (beats 100.00%)
**Memory:** 48328000 (beats 14.47%)
**Submission Date:** Aug 6, 2026, 2:20 PM
**Problem URL:** [https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

---

## Problem Statement

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

Constraints:

- 0 <= nums.length <= 10^5

- -10^9 <= nums[i] <= 10^9

- nums is a non-decreasing array.

- -10^9 <= target <= 10^9

---

## Examples

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Input: nums = [], target = 0
Output: [-1,-1]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr =  {-1,-1};
        arr[0] = search(nums, true, target);
        arr[1] = search(nums, false, target);
        return arr;
    }
    public static int search(int[] nums , boolean isFirstIndex , int target){

        int high = nums.length-1;
        int low =0;
        int ans =-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<target){
                low = mid+1;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                ans = mid;
                if(isFirstIndex){
                    high = mid -1;
                }else{
                    low = mid+1;
                }
            }
        }
        return ans;
    }
}
```
