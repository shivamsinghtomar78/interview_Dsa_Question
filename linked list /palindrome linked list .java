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


// Approach 3:convert in arrayList and compare element from starting and end 
// T.C : O(n)
// S.C : O(n)
class solution{
    public boolean Ispalindrome(ListNode head){
        List<Integer> temp=new ArrayList();
        ListNode curr=head;
        while(curr!=null){
            temp.add(curr.val);
            curr=curr.next;
        }
        int i=0;
        int j=temp.size()-1;
        while(i<j){
            if(!temp.get(i).equals(temp.get(i)))
                return false;
            i++;
            j--;
        }
        return true;
    }
}


// Approach-4:Travel in List with slow and fast and reverse first with travel and compare first half and second half
// T.C : O(n)
// S.C : O(1)
class solution{
    public boolean Ispalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=Head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null && prev!=null){
            if(slow.val!=prev.val) return false;
            prev=prev.next;
            slow=slow.next;
        }
        return true;
    }
}

// Approach-5 : using recursion only   
// T.C : O(n)
// S.C : O(1) Auxiliary space


class Solution {
    ListNode curr;

    public boolean solve(ListNode head) {
        if(head == null)
        return true;
        boolean ans=solve(head.next);
        if(head.val!=curr.val) return false; 
        curr = curr.next;
        return ans;
    }

    public boolean isPalindrome(ListNode head) {
        curr = head;

        return solve(head);
    }
}

