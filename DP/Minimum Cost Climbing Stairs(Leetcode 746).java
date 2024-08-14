/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int minCost(int[] cost,int idx,int[] dp){
        if(idx==0 || idx==1) return cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=cost[idx]+Math.min(minCost(cost,idx-1,dp),minCost(cost,idx-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
}

/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int []dp=new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
