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
