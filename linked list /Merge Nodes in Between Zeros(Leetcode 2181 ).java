/*
Approach-1: iterate and sum then connect the sum
Time complexity:O(n);
Space complexity:O(1); */

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode t1=head;
        ListNode t2=head.next;
        ListNode newHead=t1;
        int sum=0;
        while(t2!=null){
            sum+=t2.val;
            // Find the sum and connect with t1
            if(t2.val==0){
                ListNode t3=new ListNode(sum);
                t1.next=t3;
                t1=t3;
                sum=0;
            }
            t2=t2.next;// travel the t2 in list
        }
        return newHead.next;
    }
}
