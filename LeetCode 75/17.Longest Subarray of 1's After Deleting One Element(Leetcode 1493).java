/*
Approach: brute force  ;
Time complexity:O(N^2);
Space complexity:O(1); */

class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int p=1;
            int count=0;
            for(int j=i;j<n;j++){
                if(p<0) break;
                if(nums[j]==0) {
                    p--;
                    continue;
                }
                count++;
            }
            if(count==n) count--;
            mx=Math.max(mx,count);
        }
        return mx;
    }
}
