# GCD of Odd and Even Sums

**Difficulty:** Easy
**Language:** java
**Runtime:** 3 (beats 24.25%)
**Memory:** 42568000 (beats 57.16%)
**Submission Date:** Jul 15, 2026, 2:42 PM
**Problem URL:** [https://leetcode.com/problems/gcd-of-odd-and-even-sums/](https://leetcode.com/problems/gcd-of-odd-and-even-sums/)

---

## Problem Statement

You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

-
sumOdd: the sum of the smallest n positive odd numbers.

-
sumEven: the sum of the smallest n positive even numbers.

Return the GCD of sumOdd and sumEven.

Example 1:

Input: n = 4

Output: 4

Explanation:

- Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16

- Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20

Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

Example 2:

Input: n = 5

Output: 5

Explanation:

- Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25

- Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30

Hence, GCD(sumOdd, sumEven) = GCD(25, 30) = 5.

Constraints:

- 1 <= n <= 10​​​​​​​00

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
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }

        }
        while(evenSum!=0){
            int temp = evenSum;
            evenSum = oddSum % evenSum;
            oddSum = temp;

        }
        return oddSum;
    }
}
```
