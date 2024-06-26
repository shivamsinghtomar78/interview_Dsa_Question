  //Step-1:Create deep copy w/o random connections
        ListNode newHead=new ListNode(head.val);
        ListNode t1=head.next;
        ListNode t2=newHead;
        while(t!=null){
            ListNode temp=new ListNode(t1.val);
            t2.next=temp;
            t2=t2.next;
            t1=t1.next;
        }
        
    
