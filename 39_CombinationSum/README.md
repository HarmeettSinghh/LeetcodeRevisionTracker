# Combination Sum

**Difficulty:** Medium
**Language:** java
**Runtime:** null
**Memory:** null
**Submission Date:** Aug 31, 2026, 10:12 PM
**Problem URL:** [https://leetcode.com/problems/combination-sum/](https://leetcode.com/problems/combination-sum/)

---

## Problem Statement

Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:

Input: candidates = [2], target = 1
Output: []

Constraints:

- 1 <= candidates.length <= 30

- 2 <= candidates[i] <= 40

- All elements of candidates are distinct.

- 1 <= target <= 40

---

## Examples

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Input: candidates = [2], target = 1
Output: []

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0, result, list, candidates, target);
        return result;
    }

    public void solve(int i, List<List<Integer>> result, List<Integer> list, int[] arr, int target) {
        int n = arr.length ;

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if(i==n || target<0){
            return;
        }

        list.add(arr[i]);
        solve(i, result, list, arr, target - arr[i]);
        list.remove(list.size() - 1);
        solve(i + 1, result, list, arr, target);

    }
}
```
