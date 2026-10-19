# Bulb Switcher

**Difficulty:** Medium
**Language:** java
**Runtime:** 0 (beats 100.00%)
**Memory:** 41776000 (beats 89.76%)
**Submission Date:** Oct 19, 2026, 2:28 PM
**Problem URL:** [https://leetcode.com/problems/bulb-switcher/](https://leetcode.com/problems/bulb-switcher/)

---

## Problem Statement

There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the i^th round, you toggle every i bulb. For the n^th round, you only toggle the last bulb.

Return the number of bulbs that are on after n rounds.

Example 1:

Input: n = 3
Output: 1
Explanation: At first, the three bulbs are [off, off, off].
After the first round, the three bulbs are [on, on, on].
After the second round, the three bulbs are [on, off, on].
After the third round, the three bulbs are [on, off, off].
So you should return 1 because there is only one bulb is on.

Example 2:

Input: n = 0
Output: 0

Example 3:

Input: n = 1
Output: 1

Constraints:

- 0 <= n <= 10^9

---

## Examples

Input: n = 3
Output: 1
Explanation: At first, the three bulbs are [off, off, off].
After the first round, the three bulbs are [on, on, on].
After the second round, the three bulbs are [on, off, on].
After the third round, the three bulbs are [on, off, off].
So you should return 1 because there is only one bulb is on.
Input: n = 0
Output: 0

Input: n = 1
Output: 1

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int bulbSwitch(int n) {
       return (int)Math.floor(Math.sqrt(n));
    }
}
```
