class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        ListNode lastNode = current;
        
        int rotations = k % length;
        if (rotations == 0) {
            return head;
        }
        
        int stepsToNewEnd = length - rotations - 1;
        ListNode newLastNode = head;
        for (int i = 0; i < stepsToNewEnd; i++) {
            newLastNode = newLastNode.next;
        }
        
        ListNode newHead = newLastNode.next;
        newLastNode.next = null;
        
        lastNode.next = head;
        
        return newHead;
    }
}
