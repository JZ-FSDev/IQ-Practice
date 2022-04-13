/**
 * Self-written solution of "Merge Two Sorted Lists" from LeetCode.
 * Faster than 100.00% of Java online submissions.
 * Less than 82.93% of Java online submissions.
 * 
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class MergeTwoSortedLinkedLists {

    /**
     * You are given the heads of two sorted linked lists list1 and list2.
     * 
     * Merge the two lists in a one sorted list. The list should be made by splicing
     * together the nodes of the first two lists.
     * 
     * Return the head of the merged linked list.
     * 
     * @param list1 The first list to be merged with the second list.
     * @param list2 The second list to be merged with the first list.
     * @return The head of the merged list.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode newHead = null;
        ListNode currNew = null;

        if (list2 == null) {
            return list1;
        } else if (list1 == null) {
            return list2;
        } else {
            while (curr1 != null || curr2 != null) {
                if (curr1 == null) {
                    if (newHead == null) {
                        newHead = new ListNode(curr2.val, null);
                        currNew = newHead;
                    } else {
                        currNew.next = new ListNode(curr2.val, null);
                        currNew = currNew.next;
                    }
                    curr2 = curr2.next;
                } else if (curr2 == null) {
                    if (newHead == null) {
                        newHead = new ListNode(curr1.val, null);
                        currNew = newHead;
                    } else {
                        currNew.next = new ListNode(curr1.val, null);
                        currNew = currNew.next;
                    }
                    curr1 = curr1.next;
                } else {
                    if (curr1.val <= curr2.val) {
                        if (newHead == null) {
                            newHead = new ListNode(curr1.val, null);
                            currNew = newHead;
                        } else {
                            currNew.next = new ListNode(curr1.val, null);
                            currNew = currNew.next;
                        }
                        curr1 = curr1.next;
                    } else {
                        if (newHead == null) {
                            newHead = new ListNode(curr2.val, null);
                            currNew = newHead;
                        } else {
                            currNew.next = new ListNode(curr2.val, null);
                            currNew = currNew.next;
                        }
                        curr2 = curr2.next;
                    }
                }
            }
        }
        return newHead;
    }
}
