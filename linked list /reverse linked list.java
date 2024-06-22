//Approach 1:Recursive method 
// T.c=O(n)
//S.c =O(n)
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
}

//Approach 2:Iterative method 
// t.c=O(n)
// s.c=O(1)
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
}
