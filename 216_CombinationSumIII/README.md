# Combination Sum III

**Difficulty:** Medium
**Language:** java
**Runtime:** 0 (beats 100.00%)
**Memory:** 42580000 (beats 28.70%)
**Submission Date:** Sep 1, 2026, 6:53 PM
**Problem URL:** [https://leetcode.com/problems/combination-sum-iii/](https://leetcode.com/problems/combination-sum-iii/)

---

## Problem Statement

Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

- Only numbers 1 through 9 are used.

- Each number is used at most once.

Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.

Example 2:

Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.

Example 3:

Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.

Constraints:

- 2 <= k <= 9

- 1 <= n <= 60

---

## Examples

Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
Input: k = 3, n = 9
Output: [[1,2,6],[1,3,5],[2,3,4]]
Explanation:
1 + 2 + 6 = 9
1 + 3 + 5 = 9
2 + 3 + 4 = 9
There are no other valid combinations.

Input: k = 4, n = 1
Output: []
Explanation: There are no valid combinations.
Using 4 different numbers in the range [1,9], the smallest sum we can get is 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0, k, n, arr, result, list);
        return result;
    }

    public void solve(int i, int k, int sum, int[] arr, List<List<Integer>> result, List<Integer> list) {
        if (k == list.size()) {
            if (sum == 0) {
                result.add(new ArrayList<>(list));
                return;
            }
        }
        if (i == arr.length || sum < 0) {
            return;
        }
        list.add(arr[i]);
        solve(i + 1, k, sum - arr[i], arr, result, list);
        list.remove(list.size() - 1);
        solve(i + 1, k, sum, arr, result, list);
    }
}
```
