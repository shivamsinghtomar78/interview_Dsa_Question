/*
Approach: LinkedList
Time complexity:O(N);
Space complexity:O(1); */

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
       ListNode odd=new ListNode(head.val);
       ListNode even=new ListNode(head.next.val); 
       temp=head.next.next;
       ListNode dummyOdd=odd;
       ListNode dummyEven=even;

        for(int i=3;i<=n;i++){
            if(i%2!=0){
                dummyOdd.next=new ListNode(temp.val);
                dummyOdd=dummyOdd.next;
            }
            else{
                dummyEven.next=new ListNode(temp.val);
                dummyEven=dummyEven.next;
            }
            temp=temp.next;
        }

        dummyOdd.next=even;
        return odd;
    }
}
