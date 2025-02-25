class Solution {
    public ListNode swapPairs(ListNode h) {
        ListNode d = new ListNode(0);
        d.next = h;
        ListNode c = d;
        
        while (c.next != null && c.next.next != null) {
            ListNode f = c.next;
            ListNode s = c.next.next;
            f.next = s.next;
            c.next = s;
            c.next.next = f;
            c = c.next.next;
        }
        return d.next;
    }
}
