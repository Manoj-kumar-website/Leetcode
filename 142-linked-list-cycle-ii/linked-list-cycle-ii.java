/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        Map<ListNode,Integer> mp=new LinkedHashMap<>();
        while(temp != null){
            if(mp.containsKey(temp)){
               break;
            }
            mp.put(temp,1);
            temp=temp.next;
        }
        return temp;
    }
}