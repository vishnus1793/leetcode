class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        
        ListNode a = head;
        List<Integer> l = new ArrayList<>();
        
        while (a != null) {
            l.add(a.val);
            a = a.next;
        }
        
        int[] r = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            r[i] = l.get(i);
        }
        Arrays.sort(r);
        
        ListNode sortedHead = new ListNode(r[0]);
        ListNode sortedCurrent = sortedHead;
        
        for (int i = 1; i < r.length; i++) {
            sortedCurrent.next = new ListNode(r[i]);
            sortedCurrent = sortedCurrent.next;
        }
        
        return sortedHead;
    }
}