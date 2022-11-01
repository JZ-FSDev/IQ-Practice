// @author JZ-FSDev
// Runtime: 34 ms, faster than 16.09% of Java online submissions for Palindrome Linked List.

// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
public class PalindromeLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        Stack<Integer> s = new Stack<Integer>();

        public boolean isPalindrome(ListNode head) {
            ListNode temp = head;
            boolean valid = true;

            while (temp != null) {
                s.push(temp.val);
                temp = temp.next;
            }

            temp = head;

            while (temp != null && valid) {
                if (temp.val != s.pop()) {
                    valid = false;
                }
                temp = temp.next;
            }

            return valid;
        }
    }
}
