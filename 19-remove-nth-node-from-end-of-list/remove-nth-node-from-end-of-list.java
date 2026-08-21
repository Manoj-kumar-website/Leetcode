/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode temp1=temp;
        ListNode temp2=temp;
        while(n!=0){
            temp2=temp2.next;
            n--;
        }
        while(temp2.next != null){
            temp2=temp2.next;
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return temp.next;
    }
}