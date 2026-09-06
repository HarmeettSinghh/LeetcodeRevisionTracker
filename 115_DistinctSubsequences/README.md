# Distinct Subsequences

**Difficulty:** Hard
**Language:** java
**Runtime:** 22 (beats 24.24%)
**Memory:** 66444000 (beats 6.38%)
**Submission Date:** Sep 6, 2026, 2:48 PM
**Problem URL:** [https://leetcode.com/problems/distinct-subsequences/](https://leetcode.com/problems/distinct-subsequences/)

---

## Problem Statement

Given two strings s and t, return the number of distinct subsequences of s which equals t.

The test cases are generated so that the answer fits on a 32-bit signed integer.

Example 1:

Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from s.
rabbbit
rabbbit
rabbbit

Example 2:

Input: s = "babgbag", t = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from s.
babgbag
babgbag
babgbag
babgbag
babgbag

Constraints:

- 1 <= s.length, t.length <= 1000

- s and t consist of English letters.

---

## Examples

Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from s.
rabbbit
rabbbit
rabbbit

Input: s = "babgbag", t = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from s.
babgbag
babgbag
babgbag
babgbag
babgbag

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int numDistinct(String s, String t) {
        long[][] dp = new long[s.length()][t.length()];
        for (long[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        long result = 0;

        result = solve(s, t, 0, 0, dp);
        return (int)result;
    }

    public long solve(String s, String t, int i, int j, long[][] dp) {

        if (j == t.length()) {
            return 1;
        }
        if (i == s.length()) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = solve(s, t, i + 1, j + 1, dp) + solve(s, t, i + 1, j,dp);
        } else {
            dp[i][j] = solve(s, t, i + 1, j,dp);
        }
        return dp[i][j];
    }
}
```
