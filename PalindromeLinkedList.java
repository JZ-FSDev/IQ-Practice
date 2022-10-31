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
        LinkedNode rev = new ListNode();

        public boolean isPalindrome(ListNode head, ListNode curr) {
            if (head != null) {
                isPalindrome(head.next, rev);
            }

        }
    }
}
