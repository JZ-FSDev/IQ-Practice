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
