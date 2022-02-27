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


 /**
 * Self-written "Add Two Numbers" from LeetCode solution.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class AddTwoNumbersLinkedList {
    public static void main(String[] args) {
        // Test the method
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(4, one);
        ListNode three = new ListNode(2, two);

        ListNode four = new ListNode(4);

        ListNode ans = addTwoNumbers(three, four);

        String sum = "";
        while(ans != null){
            sum += ans.val;
            ans = ans.next;
        }
        System.out.println(sum);
    }

    /**
     * You are given two non-empty linked lists representing two non-negative integers. 
     * The digits are stored in reverse order, and each of their nodes contains a single digit. 
     * Add the two numbers and return the sum as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * 
     * Follow-up: What if the the digits in the linked list are stored in non-reversed order? For example:
     * (3→4→2)+(4→6→5)=8→0→7
     * Ans: Instead of making the nodes then assigning the next node, do the instantiation of the new node with next
     * as the current node then set the current node to the new node and repeat.
     * 
     * @param l1 The head of the first linked list to add.
     * @param l2 The head of the second linked list to add.
     * @return The head of the linked list representing the sum of the specified two linked lists.
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(l1.val + l2.val); // since both lists are non-empty
        ListNode ans = current;
        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null || l2 != null){ // || allows traversal to end of the longer list even if there is a shorter list
            if(l1 == null){
                if(current.val >= 10){
                    current.val %= 10;
                    current.next = new ListNode(l2.val + 1);
                }else{
                    current.next = new ListNode(l2.val);
                }
                current = current.next;
                l2 = l2.next;
            }else if(l2 == null){
                if(current.val >= 10){
                    current.val %= 10;
                    current.next = new ListNode(l1.val + 1);
                }else{
                    current.next = new ListNode(l1.val);
                }
                current = current.next;
                l1 = l1.next;
            }else{
                if(current.val >= 10){
                    current.val %= 10;
                    current.next = new ListNode(l1.val + l2.val + 1);
                }else{
                    current.next = new ListNode(l1.val + l2.val);
                }
                current = current.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if(current.val >= 10){ // if last node is greater than or equal to 10, carry over one last time
            current.val %= 10;
            current.next = new ListNode(1);
        }
        return ans;
    }
}
