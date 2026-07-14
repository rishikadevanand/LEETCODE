// Last updated: 7/14/2026, 2:46:01 PM
class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode prev=null;
    ListNode curr=head;
    while(curr!=null){
        ListNode  temp=curr.next;   
        curr.next=prev;              
         prev = curr;               
        curr=temp;                  
        }
    return prev;
    }
}