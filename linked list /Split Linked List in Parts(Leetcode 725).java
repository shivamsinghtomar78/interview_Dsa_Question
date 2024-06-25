//Appraoch -1:splitting list in k part by travelling in whole list
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
