/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n*sqrt(n));
Space complexity:O(n);
*/
class Solution {
    public int numSquares(int n) {
      int [] dp=new int[n+1];
      Arrays.fill(dp,-1);
      return minNumber(n,dp);  
    }
    int minNumber(int n,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int minCount=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int result=1+minNumber(n-i*i,dp);
            minCount=Math.min(minCount,result);
        }
        return dp[n]=minCount;
    }
}
