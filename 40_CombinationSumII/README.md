# Combination Sum II

**Difficulty:** Medium
**Language:** java
**Runtime:** null
**Memory:** null
**Submission Date:** Sep 1, 2026, 1:33 PM
**Problem URL:** [https://leetcode.com/problems/combination-sum-ii/](https://leetcode.com/problems/combination-sum-ii/)

---

## Problem Statement

Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output:
[
[1,2,2],
[5]
]

Constraints:

- 1 <= candidates.length <= 100

- 1 <= candidates[i] <= 50

- 1 <= target <= 30

---

## Examples

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Input: candidates = [2,5,2,1,2], target = 5
Output:
[
[1,2,2],
[5]
]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0, candidates , target , result , list);
        return result;
    }
    public void solve(int i , int[] arr , int target , List<List<Integer>> result,List<Integer> list){
        int n = arr.length;
        if(target ==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(i==n || target<0){
            return;
        }
        list.add(arr[i]);
        solve(i+1 , arr , target-arr[i], result, list);
        list.remove(list.size()-1);
        i=i+1;
        while(i<n && arr[i]==arr[i-1]){
            i++;
        }

        solve(i , arr , target , result , list);
    }
}
```
