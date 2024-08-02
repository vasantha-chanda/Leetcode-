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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null){
            return head;
        }
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        ListNode tail= temp;
        tail.next=head;
        
        int rotations=k%len;
        int skip=len-rotations;
        ListNode newlast=head;
        for(int i=0;i<skip-1;i++){
            newlast=newlast.next;
        }
        head= newlast.next;
        newlast.next=null;
        
        return head;
}
}