/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int rob(int[] arr,int i,int n,int[]dp){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=arr[i]+rob(arr,i+2,n,dp);
        int skip=rob(arr,i+1,n,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] arr) {
        int n=arr.length;
        int [] dp=new int[n];
        Arrays.fill(dp,-1);
        return rob(arr,0,n,dp);
    }
}
