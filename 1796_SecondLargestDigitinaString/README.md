# Second Largest Digit in a String

**Difficulty:** Easy
**Language:** java
**Runtime:** 3 (beats 28.73%)
**Memory:** 43440000 (beats 55.28%)
**Submission Date:** Aug 7, 2026, 9:33 PM
**Problem URL:** [https://leetcode.com/problems/second-largest-digit-in-a-string/](https://leetcode.com/problems/second-largest-digit-in-a-string/)

---

## Problem Statement

Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

Example 2:

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit.

Constraints:

- 1 <= s.length <= 500

- s consists of only lowercase English letters and digits.

---

## Examples

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit.

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int secondHighest(String s) {
        int secondLargest = -1;
        int largest = -1;
        HashSet<Integer> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            char ch = arr[i];
            if(Character.isDigit(ch)){
                set.add(ch-'0');
            }
        }
        for(int i : set){
            if(i>largest){
                secondLargest = largest;
                largest =i;
            }
            else if(i>secondLargest && i!=largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
```
