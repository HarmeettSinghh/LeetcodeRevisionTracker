# Letter Combinations of a Phone Number

**Difficulty:** Medium
**Language:** java
**Runtime:** 3 (beats 33.49%)
**Memory:** 48968000 (beats 20.08%)
**Submission Date:** Sep 5, 2026, 3:11 PM
**Problem URL:** [https://leetcode.com/problems/letter-combinations-of-a-phone-number/](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

---

## Problem Statement

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:

Input: digits = "2"
Output: ["a","b","c"]

Constraints:

- 1 <= digits.length <= 4

- digits[i] is a digit in the range ['2', '9'].

---

## Examples

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Input: digits = "2"
Output: ["a","b","c"]

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        solve(0, map , result , digits ,"" );
        return result;
    }
    public void solve(int i , String[] map , List<String> result , String digits , String s){
        if(i==digits.length()){
            result.add(s);
            return;
        }
        String chars =  map[digits.charAt(i)-'0'];
        for(char ch : chars.toCharArray()){
            solve(i+1 , map , result , digits , s+ch);
        }
    }
}
```
