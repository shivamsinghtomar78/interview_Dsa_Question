//Approach-1:Dividing list in three part and then reverse required range and then connect list 
// t.c :O(n)
// s.c :O(1)
class Solution {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null)
            return head;
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        int pos = 1;
        ListNode temp = head;
        while (temp != null) {
            if (pos == left - 1)
                a = temp;
            if (pos == left)
                b = temp;
            if (pos == right)
                c = temp;
            if (pos == right + 1)
                d = temp;
            temp = temp.next;
            pos++;
        }
        if (a != null)
            a.next = null;
        if (c != null)
            c.next = null;
        reverse(b);
        if (a != null)
            a.next = c;
        b.next = d;
        if (a == null)
            return c;
        return head;

    }
}



//Approach-2:
// t.c :O(n)
// s.c :O(1)

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
         
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        
        ListNode curr = prev.next;
        
         
        for (int i = 1; i <= right - left; i++) {
            ListNode temp = prev.next;  
            prev.next = curr.next;  
            curr.next = curr.next.next; 
            prev.next.next = temp;  
        }
    
        return dummy.next;
    }
}

