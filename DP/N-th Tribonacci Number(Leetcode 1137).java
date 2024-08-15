/*
Approach-1:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n);
Space complexity:O(n);
*/

lass Solution {
    public int tribonacci(int n) {
        if(n<=1) return n;
        int [] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}

/*
Approach-2:Recursion + Memoization(DP);
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int tribo(int n,int[]dp){
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if(dp[n]!=0) return dp[n];
        int ans=dp[n]=tribo(n-1,dp)+tribo(n-2,dp)+tribo(n-3,dp);
        dp[n]=ans;
        return ans;
    }
    public int tribonacci(int n) {
        int[]dp=new int[n+1];
        return tribo(n,dp);
    }
}
