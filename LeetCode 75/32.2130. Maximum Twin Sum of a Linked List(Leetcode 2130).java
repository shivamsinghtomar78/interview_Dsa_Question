/*
Approach: LinkedList and ArrayList;
Time complexity:O(N);
Space complexity:O(N); */
 
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp=head;
        List<Integer> helper=new ArrayList<>();
        while(temp!=null){
            helper.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int j=helper.size()-1;
        int mx=Integer.MIN_VALUE;
        while(i<j){
            mx=Math.max(mx,helper.get(i)+helper.get(j));
            i++;
            j--;
        }
        return mx;
    }
}

/*
Approach: LinkedList and Stack;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        int n=st.size();
        int mx=Integer.MIN_VALUE;
        temp=head;
        for(int i=0;i<n/2;i++){
            int p=st.pop();
            mx=Math.max(mx,p+temp.val);
            temp=temp.next;
        }
        return mx;
    }
}
