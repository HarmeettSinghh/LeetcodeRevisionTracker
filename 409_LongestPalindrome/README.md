# Longest Palindrome

**Difficulty:** Easy
**Language:** java
**Runtime:** 7 (beats 49.57%)
**Memory:** 43356000 (beats 27.81%)
**Submission Date:** Sep 3, 2026, 10:00 PM
**Problem URL:** [https://leetcode.com/problems/longest-palindrome/](https://leetcode.com/problems/longest-palindrome/)

---

## Problem Statement

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

Constraints:

- 1 <= s.length <= 2000

- s consists of lowercase and/or uppercase English letters only.

---

## Examples

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result =0;
        boolean odd = false;
        for(char c: s.toCharArray()){
            map.put(c , map.getOrDefault(c,0)+1);
        }
        for(int i : map.values()){
            if(i%2==0){
                result+=i;
            }else {
                result+= i-1;
                odd = true;
            }


        }
        if(odd){
            result++;
        }
        return result;

    }
}
```
