/*
Approach: LinkedList
Time complexity:O(N);
Space complexity:O(1); */

 
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode temp=head;
        int len=0;
       while(temp!=null){
        temp=temp.next;
        len++;
       }
       temp=head;
       for(int i=0;i<len/2-1;i++){
        temp=temp.next;
       }
       temp.next=temp.next.next;
        return head;
    }
}

/*
Approach: LinkedList
Time complexity:O(N);
Space complexity:O(1); */

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        if (prev != null) {
            prev.next = slow.next;
        }
        return head;
    }
}
