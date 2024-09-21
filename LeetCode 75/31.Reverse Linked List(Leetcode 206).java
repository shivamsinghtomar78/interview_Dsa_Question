/*
Approach: LinkedList;
Time complexity:O(N);
Space complexity:O(N); */


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



/*
Approach: LinkedList;
Time complexity:O(N);
Space complexity:O(1); */




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
