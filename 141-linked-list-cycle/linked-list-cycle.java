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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        Set<ListNode> mp=new HashSet<>();
        while(temp != null){
            if(mp.contains(temp)){
                return true;
            }
            mp.add(temp);
            temp=temp.next;
        }
        return false;
    }
}