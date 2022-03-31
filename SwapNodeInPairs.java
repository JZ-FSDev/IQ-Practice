public class SwapNodeInPairs {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        
        one.next = two;
        two.next = three;
        three.next = four;

        swapPairs(one);        
    }

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
