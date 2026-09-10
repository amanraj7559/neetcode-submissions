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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,nextNode=null,prevNode=null;
        while(temp!=null){
            ListNode KthNode=find(temp,k);
            if(KthNode==null){
                if(prevNode!=null){
                     prevNode.next=nextNode;
                }
                return head;

            }
            nextNode=KthNode.next;
            KthNode.next=null;
            reverse(temp);
            
            
            if(temp==head) head=KthNode;
            else prevNode.next=KthNode;
            prevNode=temp;
            temp=nextNode;
        }
        return head;
        
        
    }
    static ListNode find(ListNode temp,int k){
        while(temp!=null&&k>1){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    static void reverse(ListNode head){
        ListNode cur=head,prev=null;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
    }
}