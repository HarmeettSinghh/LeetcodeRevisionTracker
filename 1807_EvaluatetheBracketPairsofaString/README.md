# Evaluate the Bracket Pairs of a String

**Difficulty:** Medium
**Language:** java
**Runtime:** null
**Memory:** null
**Submission Date:** Sep 26, 2026, 7:10 PM
**Problem URL:** [https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/](https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/)

---

## Problem Statement

You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.

- For example, in the string "(name)is(age)yearsold", there are two bracket pairs that contain the keys "name" and "age".

You know the values of a wide range of keys. This is represented by a 2D string array knowledge where each knowledge[i] = [keyi, valuei] indicates that key keyi has a value of valuei.

You are tasked to evaluate all of the bracket pairs. When you evaluate a bracket pair that contains some key keyi, you will:

- Replace keyi and the bracket pair with the key's corresponding valuei.

- If you do not know the value of the key, you will replace keyi and the bracket pair with a question mark "?" (without the quotation marks).

Each key will appear at most once in your knowledge. There will not be any nested brackets in s.

Return the resulting string after evaluating all of the bracket pairs.

Example 1:

Input: s = "(name)is(age)yearsold", knowledge = [["name","bob"],["age","two"]]
Output: "bobistwoyearsold"
Explanation:
The key "name" has a value of "bob", so replace "(name)" with "bob".
The key "age" has a value of "two", so replace "(age)" with "two".

Example 2:

Input: s = "hi(name)", knowledge = [["a","b"]]
Output: "hi?"
Explanation: As you do not know the value of the key "name", replace "(name)" with "?".

Example 3:

Input: s = "(a)(a)(a)aaa", knowledge = [["a","yes"]]
Output: "yesyesyesaaa"
Explanation: The same key can appear multiple times.
The key "a" has a value of "yes", so replace all occurrences of "(a)" with "yes".
Notice that the "a"s not in a bracket pair are not evaluated.

Constraints:

- 1 <= s.length <= 10^5

- 0 <= knowledge.length <= 10^5

- knowledge[i].length == 2

- 1 <= keyi.length, valuei.length <= 10

- s consists of lowercase English letters and round brackets '(' and ')'.

- Every open bracket '(' in s will have a corresponding close bracket ')'.

- The key in each bracket pair of s will be non-empty.

- There will not be any nested bracket pairs in s.

- keyi and valuei consist of lowercase English letters.

- Each keyi in knowledge is unique.

---

## Examples

Input: s = "(name)is(age)yearsold", knowledge = [["name","bob"],["age","two"]]
Output: "bobistwoyearsold"
Explanation:
The key "name" has a value of "bob", so replace "(name)" with "bob".
The key "age" has a value of "two", so replace "(age)" with "two".

Input: s = "hi(name)", knowledge = [["a","b"]]
Output: "hi?"
Explanation: As you do not know the value of the key "name", replace "(name)" with "?".

Input: s = "(a)(a)(a)aaa", knowledge = [["a","yes"]]
Output: "yesyesyesaaa"
Explanation: The same key can appear multiple times.
The key "a" has a value of "yes", so replace all occurrences of "(a)" with "yes".
Notice that the "a"s not in a bracket pair are not evaluated.

---

## Constraints

_Not available._

---

## My Solution

```java
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String , String> map = new HashMap<>();
        for(int i = 0; i<knowledge.size(); i++){
            List<String> row = knowledge.get(i);
            String key = row.get(0);
            String value = row.get(1);
            map.put(key, value);
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                i++;
                StringBuilder key = new StringBuilder();
                while(s.charAt(i)!=')'){
                    
                    key.append(s.charAt(i));
                    i++;
                }
                if(map.containsKey(key.toString())){
                    result.append(map.get(key.toString()));
                }else{
                    result.append('?');
                }
            }
            else{
                result.append(ch);
            }
        }
    return result.toString();

    }
}
```
