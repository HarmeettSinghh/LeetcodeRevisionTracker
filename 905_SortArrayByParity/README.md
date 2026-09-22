# Sort Array By Parity

**Difficulty:** Easy
**Language:** java
**Runtime:** null
**Memory:** null
**Submission Date:** Sep 22, 2026, 9:34 PM
**Problem URL:** [https://leetcode.com/problems/sort-array-by-parity/](https://leetcode.com/problems/sort-array-by-parity/)

---

## Problem Statement

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:

Input: nums = [0]
Output: [0]

Constraints:

- 1 <= nums.length <= 5000

- 0 <= nums[i] <= 5000

---

## Examples

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Input: nums = [0]
Output: [0]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int l = 0;
        int r = 0;
        for(r = 0 ; r<arr.length; r++){
            if(arr[r]%2 == 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }
        return arr;
    }
}
```
