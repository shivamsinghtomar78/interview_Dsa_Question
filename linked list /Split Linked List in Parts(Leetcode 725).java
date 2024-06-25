//Appraoch -1:splitting list in k part by travelling in whole list using arraylist
//T.c :O(n);
//S.c :O(k);

class Solution {
    public int lengthOfList(ListNode head){
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        return n;
    } 
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=lengthOfList(head);
        int size=n/k;
        int extra=n%k;
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        int len=1;
        while(temp!=null){
            int s=size;
            if(extra >0) s++;
            if(len==1) arr.add(temp);
            if(len==s){
                ListNode a=temp.next;
                temp.next=null;
                temp=a;
                len=1;
                extra--;

            }
            else{
                len++;
                temp=temp.next;
            }
            
        }
        ListNode[] ans = new ListNode[k];
        ans = arr.toArray(ans);
        return ans;
        
    }
}


//Approach-2:add in array
//T.c=O(n);
// S.c=O(k);

class Solution {
    public int length(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        return n;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=length(head);
        int size=n/k;
        int extra=n%k;
        ListNode []result=new ListNode[k];
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            result[i]=curr;
            for(int j=0;j<size+(extra>0 ? 1:0);j++){
                prev=curr;
                curr=curr.next;
            }
           if(prev!=null) prev.next=null;
            extra--;
        }
        return result;
        
    }
}
