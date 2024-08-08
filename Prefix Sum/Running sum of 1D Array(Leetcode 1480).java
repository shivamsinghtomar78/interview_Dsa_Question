/*
Approach-1:Prefix Sum;
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int [] pre=new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=nums[i]+pre[i-1];
        }
        return pre;
    }
}
