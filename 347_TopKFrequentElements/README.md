# Top K Frequent Elements

**Difficulty:** Medium
**Language:** java
**Runtime:** 60 (beats 5.04%)
**Memory:** 47876000 (beats 19.08%)
**Submission Date:** Oct 29, 2026, 5:41 PM
**Problem URL:** [https://leetcode.com/problems/top-k-frequent-elements/](https://leetcode.com/problems/top-k-frequent-elements/)

---

## Problem Statement

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Example 2:

Input: nums = [1], k = 1

Output: [1]

Example 3:

Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]

Constraints:

- 1 <= nums.length <= 10^5

- -10^4 <= nums[i] <= 10^4

- k is in the range [1, the number of unique elements in the array].

- It is guaranteed that the answer is unique.

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

---

## Examples

_Not available._

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        
        int[] ans = new int[k];
        for(int i = 0; i<k ; i++){
            int maxNum = 0;
            int maxFreq = 0 ;
            for(int key:map.keySet()){
                if(map.get(key)>maxFreq){
                    maxFreq = map.get(key);
                    maxNum = key;
                }
            }
            ans[i] = maxNum;
            map.remove(maxNum);
        }
        return ans;
    }
}
```
