//Approach-1: Finding middle of list and reverse of second half list and then merge alternatively from both list
// T.c =O(n);
// S.c =O(1);
class Solution {
    public ListNode middleNode (ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode last=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
    public void reorderList(ListNode head) {
        ListNode leftMiddle=middleNode(head);
        ListNode head2=leftMiddle.next;
        leftMiddle.next=null;
        head2=reverse(head2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head!=null && head2!=null){
            temp.next=head;
            head=head.next;
            temp=temp.next;
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        if(head==null) temp.next=head2;
        if(head2==null) temp.next=head;
        
    }
}
