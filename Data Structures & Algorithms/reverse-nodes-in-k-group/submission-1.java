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
        ListNode nextNode=null,prevNode=null,temp=head;
        while(temp!=null){
            ListNode KthNode=find(temp,k);
            if(KthNode==null){
                if(prevNode!=null)
                prevNode.next=temp;
                return head;
            }
            nextNode=KthNode.next;
            KthNode.next=null;
            reverse(temp);

            
            if(temp!=head)
            prevNode.next=KthNode;
            else head=KthNode;
            prevNode=temp;
            temp=nextNode;
        }
        return head;

            
    }
    public static ListNode find(ListNode temp,int k){
        int i=1;
        while(temp!=null&&i<k) {
            temp=temp.next;
            i++;
        }
        return temp;
    }
    public static void reverse(ListNode head){
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        
    }
}