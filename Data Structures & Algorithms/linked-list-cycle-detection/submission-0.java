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
        ListNode cur=head,temp=head;
       
        while(cur!=null && cur.next!=null ){
            cur=cur.next.next;
            
            temp=temp.next;
            if(temp==cur) return true;
        }
        return false;
        
    }
}