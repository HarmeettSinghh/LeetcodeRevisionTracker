# Product of Array Except Self

**Difficulty:** Medium
**Language:** java
**Runtime:** 3 (beats 23.81%)
**Memory:** 64328000 (beats 91.95%)
**Submission Date:** Oct 31, 2026, 4:06 PM
**Problem URL:** [https://leetcode.com/problems/product-of-array-except-self/](https://leetcode.com/problems/product-of-array-except-self/)

---

## Problem Statement

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:

- 2 <= nums.length <= 10^5

- -30 <= nums[i] <= 30

- The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

---

## Examples

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];
        prefix[0] =1 ;
        suffix[suffix.length-1] = 1;
        for(int i =1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for(int i =suffix.length-2; i>=0 ;i--){
            suffix[i] = suffix[i+1]*nums[i];

        }
        for(int i =0;i<ans.length; i++){
            ans[i] = prefix[i] * suffix[i+1];
        }
        return ans;
    }
}
```
