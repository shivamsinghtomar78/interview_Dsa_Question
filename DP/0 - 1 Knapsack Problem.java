/*
Approach-1:Recurrsion;
Time complexity:O(2^n);
Space complexity:O(n);
Problem:https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
*/

class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
       return  profit(0,wt,val,W);
    }
    public static int profit(int i,int[]wt,int[]val,int c){
        if(i==wt.length) return 0;
        int skip=profit(i+1,wt,val,c);
        if(wt[i]>c) return skip;
        int pick=val[i]+profit(i+1,wt,val,c-wt[i]);
        return Math.max(pick,skip);
    }
}
/*
Approach-2:Recursion + Memoization(DP);
Time complexity:O(n * W);
Space complexity:O(n * W);
*/
class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        int n=val.length;
        int[][] dp=new int[n][W+1];
        for(int i=0;i<dp.length;i++)
        for(int j=0;j<dp[0].length;j++) dp[i][j]=-1;
       return  profit(0,wt,val,W,dp);
    }
    public static int profit(int i,int[]wt,int[]val,int c,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip=profit(i+1,wt,val,c,dp);
        if(wt[i]>c) return dp[i][c]= skip;
        int pick=val[i]+profit(i+1,wt,val,c-wt[i],dp);
        return dp[i][c]= Math.max(pick,skip);
    }
}
