//Approach -1:
// T.c :O(n);
// S.c :O(n);

class Solution {
    public Node deepcopy(Node head) {
        if(head==null) return null;
        Node head2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = head2;
        while (t1 != null) {
            Node temp = new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }

    public void connectAlternatively(Node head, Node head2) {
        Node dummy = new Node(-1);
        Node t1 = head;
        Node t2 = head2;
        Node temp = dummy;
        while (t1 != null) {
            temp.next = t1;
            t1 = t1.next;
            temp = temp.next;
            temp.next = t2;
            t2 = t2.next;
            temp = temp.next;
        }
    }
    public void split(Node head,Node head2){
        Node t1=head;
        Node t2=head2;
        while(t1!=null){
            t1.next=t2.next;
            t1=t1.next;
            if(t1==null) break;
            t2.next=t1.next;
            t2=t2.next;
        }

    }

    public Node copyRandomList(Node head) {
        // Step-1:Create deep copy w/o random connections
        Node head2 = deepcopy(head);
        // Step-2:Join these linked list alternatively
        connectAlternatively(head, head2);
        // Step-3:assign random pointer
         Node t1=head;
         Node t2=head2;
         while(t1!=null){
            t2=t1.next;
            t2.random=(t1.random!=null) ? t1.random.next:null;
            t1=t1.next.next;
         }
        // Step-4:split the linked list
        split(head,head2);
        return head2;

    }
}
