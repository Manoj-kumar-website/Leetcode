class Solution {
    public void reorderList(ListNode head) {

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode cur = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (cur != null) {
            ListNode after = cur.next;
            cur.next = prev;
            prev = cur;
            cur = after;
        }

        // Merge
        ListNode temp1 = head;
        ListNode temp2 = prev;

        while (temp1 != null && temp2 != null) {
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }
    }
}