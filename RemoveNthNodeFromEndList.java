import java.util.ArrayList;

public class RemoveNthNodeFromEndList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        ListNode curr = head;
        ListNode newHead = null;
        while(curr != null){
            nodes.add(curr);
            curr = curr.next;
        }
        if(n == nodes.size()){
            if(nodes.size() == 1){
                newHead = null;
            }else{
                newHead = nodes.get(1);
            }
        }else{
            nodes.get(nodes.size() - n - 1).next = nodes.get(nodes.size() - n).next;
            newHead = head;
        }
        return newHead;
    }
}
