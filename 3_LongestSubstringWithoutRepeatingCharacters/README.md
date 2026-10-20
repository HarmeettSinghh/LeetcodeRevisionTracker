# Longest Substring Without Repeating Characters

**Difficulty:** Medium
**Language:** java
**Runtime:** 40 (beats 74.83%)
**Memory:** 47164000 (beats 99.05%)
**Submission Date:** Oct 20, 2026, 6:18 PM
**Problem URL:** [https://leetcode.com/problems/longest-substring-without-repeating-characters/](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

---

## Problem Statement

Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

- 0 <= s.length <= 10^5

- s consists of English letters, digits, symbols and spaces.

---

## Examples

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0 ;
        int left  = 0;
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);
            }
            map.put(ch,right);
            int len = right - left+1;
            maxlen = Math.max(len, maxlen);
        }
        return maxlen;
    }
}
```
