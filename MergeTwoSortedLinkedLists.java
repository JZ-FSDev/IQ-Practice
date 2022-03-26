public class MergeTwoSortedLinkedLists {

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
                    if(newHead == null){
                        newHead = new ListNode(curr2.val, null);
                        currNew = newHead;
                    }else{
                        currNew.next = new ListNode(curr2.val, null);
                        currNew = currNew.next;
                    }
                    curr2 = curr2.next;
                } else if (curr2 == null) {
                    if(newHead == null){
                        newHead = new ListNode(curr1.val, null);
                        currNew = newHead;
                    }else{
                        currNew.next = new ListNode(curr1.val, null);
                        currNew = currNew.next;
                    }
                    curr1 = curr1.next;
                } else {
                    if(curr1.val <= curr2.val){
                        if(newHead == null){
                            newHead = new ListNode(curr1.val, null);
                            currNew = newHead;
                        }else{
                            currNew.next = new ListNode(curr1.val, null);
                            currNew = currNew.next;
                        }
                        curr1 = curr1.next;
                    }else{
                        if(newHead == null){
                            newHead = new ListNode(curr2.val, null);
                            currNew = newHead;
                        }else{
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
