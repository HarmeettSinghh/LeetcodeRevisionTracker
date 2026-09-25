# Koko Eating Bananas

**Difficulty:** Medium
**Language:** plaintext
**Runtime:** N/A
**Memory:** N/A
**Submission Date:** Sep 25, 2026, 2:32 PM
**Problem URL:** [https://leetcode.com/problems/koko-eating-bananas/](https://leetcode.com/problems/koko-eating-bananas/)

---

## Problem Statement

Koko loves to eat bananas. There are n piles of bananas, the i^th pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30

Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23

Constraints:

- 1 <= piles.length <= 10^4

- piles.length <= h <= 10^9

- 1 <= piles[i] <= 10^9

---

## Examples

Input: piles = [3,6,7,11], h = 8
Output: 4

Input: piles = [30,11,23,4,20], h = 5
Output: 30

Input: piles = [30,11,23,4,20], h = 6
Output: 23

---

## Constraints

_Not available._

---

## My Solution

```plaintext
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = 0;
        int k = 0;
        int ans = 0;
        for(int i : piles){
            max = Math.max(i, max);
        }
        int high = max;
        while(low<=high){
            int mid = low + (high-low)/2;
            k = totalhrs(mid, piles);
           if(k<=h){
                ans = mid;
                high = mid-1;
           }
           if(k>h){
                low = mid+1;

           }
        }
        return ans;
    }
    public int totalhrs(int sp , int[] piles){
        int ans = 0;
        for(int i: piles){
            ans+= Math.ceil((double)i/sp);
        }
        return ans;
    }
}
```
