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
        int length=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
                
                if(slow == fast){
                    length=lengthOfCycle(slow);
                    break;
                    
                }
        }
        ListNode s= head;
        ListNode f= head;
        if(length ==0 ){
            return null;
        }
        
        while(length>0){
            s=s.next;
            length--;
        }
        while(f!=s){
            s=s.next;
            f=f.next;
        
            
        }
        return s;
    
    }
    
    public int lengthOfCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        int len=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
                
                if(slow == fast){
                    ListNode temp=slow;
                    
                     
                    do{
                        temp=temp.next;
                        len++;
                    }
                    while(temp!=slow);
                        return len;
                }
        }
        return 0;
    }
}