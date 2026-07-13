# Sequential Digits

**Difficulty:** Medium
**Language:** java
**Runtime:** 0 (beats 100.00%)
**Memory:** 42500000 (beats 36.36%)
**Submission Date:** Jul 13, 2026, 8:21 PM
**Problem URL:** [https://leetcode.com/problems/sequential-digits/](https://leetcode.com/problems/sequential-digits/)

---

## Problem Statement

An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

Example 1:

Input: low = 100, high = 300
Output: [123,234]
Example 2:

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

Constraints:

- 10 <= low <= high <= 10^9

---

## Examples

Input: low = 100, high = 300
Output: [123,234]

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for(int i =1; i<=9; i++){
            int num =i;
            for(int j = i+1; j<=9; j++){
                num = num*10+j;
                if(num<=high && num>=low){
                    result.add(num);
                }
            }

        }
        Collections.sort(result);
        return result;
    }
}
```
