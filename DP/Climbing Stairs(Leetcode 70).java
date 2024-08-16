/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int climbStairs(int n) {
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    public int solve(int n,int[]dp){
        if(n<0) return 0;
        if(n==0 || n==1 || n==2) return n;
        if(dp[n]!=-1) return dp[n];
        int one=solve(n-1,dp);
        int two=solve(n-2,dp);
        return dp[n]=one+two;
    }
}
