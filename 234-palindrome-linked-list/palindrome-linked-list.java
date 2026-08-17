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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        Stack<Integer> s=new Stack<>();
        while(temp != null){
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        for(int j=0;j<s.size();j++){
            if(s.peek() != temp.val){
                return false;
            }
            temp=temp.next;
            s.pop();
        }
        //System.out.print(s);
        return true;
        
    }
}