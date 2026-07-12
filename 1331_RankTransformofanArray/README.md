# Rank Transform of an Array

**Difficulty:** Easy
**Language:** java
**Runtime:** 28 (beats 93.14%)
**Memory:** 75544000 (beats 53.05%)
**Submission Date:** Jul 12, 2026, 4:02 PM
**Problem URL:** [https://leetcode.com/problems/rank-transform-of-an-array/](https://leetcode.com/problems/rank-transform-of-an-array/)

---

## Problem Statement

Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

- Rank is an integer starting from 1.

- The larger the element, the larger the rank. If two elements are equal, their rank must be the same.

- Rank should be as small as possible.

Example 1:

Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

Example 2:

Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.

Example 3:

Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]

Constraints:

- 0 <= arr.length <= 10^5

- -10^9 <= arr[i] <= 10^9

---

## Examples

Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.

Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];
        for(int i =0; i<n; i++){
            copy[i] = arr[i];
         }
         Arrays.sort(copy);
         HashMap<Integer,Integer> map = new HashMap<>();
         int rank =1;
         for(int i =0; i<n; i++){
             if(!map.containsKey(copy[i])){
                map.put(copy[i], rank++);
             }
         }
         int[] ans  = new int[n];
        
         for(int i =0; i<arr.length; i++){
            ans[i] = map.get(arr[i]);
         }
         return ans;
    }
}
```
