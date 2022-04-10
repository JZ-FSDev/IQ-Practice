 /**
 * Self-written solution for "Swap Nodes in Pairs" from LeetCode.
 * (Faster than 100% of Java submissions).
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class SwapNodeInPairs {

    public static void main(String[] args) {
        // Test the method
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        
        one.next = two;
        two.next = three;
        three.next = four;

        swapPairs(one);        
    }

    /**
     * Given a linked list, swap every two adjacent nodes and return its head. 
     * You must solve the problem without modifying the values in the list's nodes 
     * (i.e., only nodes themselves may be changed.)
     * 
     * @param head Pointer to the head Node of the LinkedList.
     * @return Pointer to the ListNode of the swapped LinkedList.
     */
    public static ListNode swapPairs(ListNode head) {
        ListNode newHead;
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            newHead = head.next;

            ListNode curr = head.next;
            ListNode prev = head;
            ListNode prevPrev = null;

            while (prev != null && curr != null) {
                if(prevPrev != null){
                    prevPrev.next = curr;
                    prev.next = curr.next;
                    curr.next = prev;
                }else{
                    prev.next = curr.next;
                    curr.next = prev;
                }
                prevPrev = prev;
                prev = prev.next;
                if(prev != null){
                    curr = prev.next;
                }
            }
        }
        return newHead;
    }
}
