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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length == 0){
            return null;
        }
        return divide(lists,0,lists.length-1);
    }
    ListNode divide(ListNode[] list,int start,int end){
        if(start==end){
            return list[start];
        }
        else if(start+1==end){
            return merge(list[start],list[end]);
        }
        int mid = start +(end-start)/2;
        ListNode left=divide(list,start,mid);
        ListNode right=divide(list,mid+1,end);
        return  merge(left,right);
    }
    ListNode merge(ListNode l1,ListNode l2){
        ListNode d=new ListNode(0);
        ListNode cur=d;
        while(l1!= null && l2 !=null){
            if(l1.val<=l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next =l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next = (l1!= null)? l1 :l2;
        return d.next;
    }
}