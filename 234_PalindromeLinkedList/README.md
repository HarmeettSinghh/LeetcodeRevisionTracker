# Palindrome Linked List

**Difficulty:** Easy
**Language:** java
**Runtime:** 5 (beats 42.20%)
**Memory:** 94020000 (beats 89.34%)
**Submission Date:** Oct 24, 2026, 11:25 PM
**Problem URL:** [https://leetcode.com/problems/palindrome-linked-list/](https://leetcode.com/problems/palindrome-linked-list/)

---

## Problem Statement

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:

Input: head = [1,2,2,1]
Output: true

Example 2:

Input: head = [1,2]
Output: false

Constraints:

- The number of nodes in the list is in the range [1, 10^5].

- 0 <= Node.val <= 9

Follow up: Could you do it in O(n) time and O(1) space?

---

## Examples

Input: head = [1,2,2,1]
Output: true

Input: head = [1,2]
Output: false

---

## Constraints

_Not available._

---

## My Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow);
        ListNode temp1 = head;
        ListNode temp2 = newHead;
        while(temp1 != null && temp2!= null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1= temp1.next;
            temp2= temp2.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
        
    }
}
```
