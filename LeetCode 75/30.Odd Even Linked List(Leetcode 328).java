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




/*
Approach: LinkedList
Time complexity:O(N);
Space complexity:O(1); */

class Solution {
    public ListNode oddEvenList(ListNode head) {

/*
Story:
1.Hume odd and even ko segregate krna hai .
2.To let's take two pointers to point to Odd and even nodes 
3.unko alg alg segregate kardenge
4.Last me connect kardenge odd ko even se 
*/
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
