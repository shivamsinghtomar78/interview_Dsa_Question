//Approach 1:Making deep of whole list and compare 
// t.c=O(n)
//  s.c=O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode curr=head;
     ListNode prev=null;
     ListNode Next=null;
    while(curr!=null){
        Next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=Next;
    }  
    return prev; 
    }

    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        // create deep copy of list
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newHead;
        while (t1 != null) {
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newHead = reverseList(newHead);
        t1 = head;
        t2 = newHead;
        while (t1 != null) {
            if (t1.val != t2.val)
                return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}




//Approach 2:Reverse second of list and compare 
// T.c :O(n)
//S.c :O(1)
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
