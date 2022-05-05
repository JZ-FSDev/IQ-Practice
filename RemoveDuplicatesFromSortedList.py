#96.62%

def deleteDuplicates(self, head):
    """
    :type head: ListNode
    :rtype: ListNode
    """
    if head == None:
        return None
    curr = head.next
    prev = head
    while curr:
        if curr.val == prev.val:
            prev.next = curr.next
            curr = curr.next
            continue
        prev = prev.next
        curr = curr.next
    return head
