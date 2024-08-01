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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        ListNode firsthalf=head;
        ListNode secondhalf= reverse(slow.next);
        slow.next=null;
        
         while(secondhalf!=null){
             ListNode temp1=firsthalf.next;
             ListNode temp2=secondhalf.next;
             firsthalf.next=secondhalf;
             secondhalf.next=temp1;
             firsthalf=temp1;
             secondhalf=temp2;
             
             
         }
        
        }
    
     public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode nextnode=head.next;
            head.next=prev;
            prev=head;
            head=nextnode;
        }
        return prev;
   
}
}