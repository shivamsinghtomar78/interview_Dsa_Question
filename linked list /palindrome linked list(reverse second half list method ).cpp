// t.c=O(n)
// s.c=O(1)
class Solution {
  
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode last=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
 
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverseList(slow);
        ListNode t1=head;
        ListNode t2=newHead;
        while(t2!=null){
            if(t1.val!=t2.val) return false;
            t1=t1.next;
            t2=t2.next;
        }
        return true;

        
    }
}
