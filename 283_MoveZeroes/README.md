# Move Zeroes

**Difficulty:** Easy
**Language:** java
**Runtime:** 2 (beats 92.23%)
**Memory:** 47968000 (beats 20.16%)
**Submission Date:** Jul 11, 2026, 8:02 PM
**Problem URL:** [https://leetcode.com/problems/move-zeroes/](https://leetcode.com/problems/move-zeroes/)

---

## Problem Statement

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

Constraints:

- 1 <= nums.length <= 10^4

- -2^31 <= nums[i] <= 2^31 - 1

Follow up: Could you minimize the total number of operations done?

---

## Examples

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Input: nums = [0]
Output: [0]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int slow =0;
        int fast =0;
        for(fast=0; fast<nums.length; fast++){
            if(nums[fast]!=0){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        for(int i= slow;i<nums.length;i++){
            nums[i] =0;
        }
        
    }
}
```
