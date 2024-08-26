 /*
Approach-1:Recursion + Memoization(DP);
Time complexity:coins.length * (amount + 1);
Space complexity:coins.length * (amount + 1);
*/

class Solution {
    public int coinChange(int[] coins, int amount) {
        long[][] dp=new long[coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans=(int)coinCount(0,coins,amount,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
    public long coinCount(int i,int[] coins,int amount,long[][]dp){
        if(i==coins.length){
            if(amount==0) return 0;// no more coins needed
            else return Integer.MAX_VALUE;// not a valid combination;
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        long skip=coinCount(i+1,coins,amount,dp);
        if(amount-coins[i]<0) return dp[i][amount]=skip;
        long pick=1+coinCount(i,coins,amount-coins[i],dp);
        return dp[i][amount]=Math.min(skip,pick);

    }
}
