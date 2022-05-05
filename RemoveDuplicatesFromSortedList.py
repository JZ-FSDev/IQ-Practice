# Self-written solution of "Remove Duplicates from Sorted List" from LeetCode.
# Faster than 96.62% of Python online submissions.
# author JZ-FSDev

# Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
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
