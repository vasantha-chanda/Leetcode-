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
       
        ListNode tempHead=copyList(head);
        printList(tempHead);
        ListNode res=reverse(tempHead);
        printList(res);
        while(head!=null && res!=null){
            if(head.val != res.val){
                return false;
            }
            head=head.next;
            res=res.next;
            
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
    //mthod to opy entire list
    public ListNode copyList(ListNode head){
        ListNode dummyHead = new ListNode(head.val);
        ListNode current =dummyHead;
        head=head.next;
        while(head!=null){
            current.next=new ListNode(head.val);
            current=current.next;
            head=head.next;
        }
        
        return dummyHead;
    }
    public void printList(ListNode head) {
    ListNode current = head;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
    System.out.println();
}
   
    

}