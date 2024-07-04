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

/*
Approach-2: Recursion 
Time complexity:O(n);
Space complexity:O(n); */


class Solution {
    public ListNode mergeNodes(ListNode head) {
       head=head.next;
       if(head==null) return head; 
       ListNode temp=head;
       int sum=0;
       while(temp!=null && temp.val!=0){
        sum+=temp.val;
        temp=temp.next;
       }
       head.val=sum;
       head.next=mergeNodes(temp);
       return head;
    }
}

/*
Approach-3: Editorial solution
Time complexity:O(n);
Space complexity:O(1); */


public class Solution {

    public ListNode mergeNodes(ListNode head) {
        // Initialize a sentinel/dummy node with the first non-zero value.
        ListNode modify = head.next;
        ListNode nextSum = modify;

        while (nextSum != null) {
            int sum = 0;
            // Find the sum of all nodes until you encounter a 0.
            while (nextSum.val != 0) {
                sum += nextSum.val;
                nextSum = nextSum.next;
            }

            // Assign the sum to the current node's value.
            modify.val = sum;
            // Move nextSum to the first non-zero value of the next block.
            nextSum = nextSum.next;
            // Move modify also to this node.
            modify.next = nextSum;
            modify = modify.next;
        }
        return head.next;
    }
}


