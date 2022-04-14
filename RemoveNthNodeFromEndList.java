import java.util.ArrayList;

 /**
 * Solution-assisted recursive solution of "Remove Nth Node From End of List" from LeetCode.
 * Faster than 63.04% of Java online submissions.
 * Less than 81.64% of Java online submissions
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class RemoveNthNodeFromEndList {

    /**
     * Given the head of a linked list, remove the nth node from the end of the list
     * and return its head.
     * 
     * @param head Reference to the head of the LinkedList.
     * @param n The nth node from the end of the list to be removed.
     * @return The head of the linked list after the removal of the node.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        ListNode curr = head;
        ListNode newHead = null;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }
        if (n == nodes.size()) {
            if (nodes.size() == 1) {
                newHead = null;
            } else {
                newHead = nodes.get(1);
            }
        } else {
            nodes.get(nodes.size() - n - 1).next = nodes.get(nodes.size() - n).next;
            newHead = head;
        }
        return newHead;
    }
}
