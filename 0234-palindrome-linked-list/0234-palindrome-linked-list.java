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
       
        ListNode slow =head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        slow=reverse(slow);
        fast=head;
        while(slow!=null){
            if(slow.val != fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        
        return true;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode  current=head;
       
        while(current!=null){
             ListNode next=current.next;
             current.next=prev;
            prev=current;
            current=next;
            
        }
        
        return prev;
    }
     

}