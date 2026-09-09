# Count Commas in Range II

**Difficulty:** Medium
**Language:** plaintext
**Runtime:** N/A
**Memory:** N/A
**Submission Date:** Sep 9, 2026, 7:17 PM
**Problem URL:** [https://leetcode.com/problems/count-commas-in-range-ii/](https://leetcode.com/problems/count-commas-in-range-ii/)

---

## Problem Statement

You are given an integer n.

Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.

In standard formatting:

- A comma is inserted after every three digits from the right.

- Numbers with fewer than 4 digits contain no commas.

Example 1:

Input: n = 1002

Output: 3

Explanation:

The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.

Example 2:

Input: n = 998

Output: 0

Explanation:

​​​​​​​All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.

Constraints:

- 1 <= n <= 10^15

---

## Examples

_Not available._

---

## Constraints

_Not available._

---

## My Solution

```plaintext
class Solution {
    public long countCommas(long n) {
        long ans = 0L;
        for(long p = 1000; p<=n; p=p*1000){
            ans+= n-p+1;
             if (p > Long.MAX_VALUE / 1000) break;
        }
        return ans;
    }
}
```
