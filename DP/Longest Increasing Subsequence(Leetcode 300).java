
/*
Approach-1:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n);
Space complexity:O(n);
*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i-1;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]);
                }
                 
            }
            dp[i]+=1;
                mx=Math.max(mx,dp[i]);
        }
        return mx;

    }
}
