/*Time complexity:O(nlog n);
Space complexity:O(n);
Problem :https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1
*/

class Solution {
    // Function to flatten a linked list
   Node flatten(Node root) {
        Node temp=root;
        int n=0;
        while(temp != null) {
            n++;
           temp = temp.next;
      }

         temp=root;
         List<Integer> arr=new ArrayList<>();
         for(int i=0;i<n;i++){
             Node helper=temp;
             while(helper!=null){
                 arr.add(helper.data);
                 helper=helper.bottom;
             }
             temp=temp.next;
         }

         n=arr.size();
         Collections.sort(arr);
         Node head=new Node(arr.get(0));
         temp=head;
         for(int i=1;i<n;i++){
             Node node=new Node (arr.get(i));
             temp.bottom=node;
             temp=temp.bottom;
         }
         temp.bottom=null;
         return head;

    }

}

/*
T.C : O(N*N*M);
S.C : Auziliary Space = O(1) and O(N*M) */

class Solution {
    // Function to flatten a linked list
    Node flatten(Node head) {
        if(head==null) return null;
        Node temp=flatten (head.next);
        return mergeList(head,temp);
    }
    public Node mergeList(Node head1,Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        Node result ;
        if(head1.data>head2.data){
            result=head2;
            result.bottom=mergeList(head1,head2.bottom);
        }
        else {
            result=head1;
            result.bottom=mergeList(head1.bottom,head2);
        }
        return result;
    }
}
    
