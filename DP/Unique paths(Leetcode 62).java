/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(m*n);
Space complexity:O(m*n);
*/
class Solution {
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++)
            dp[i][j]=-1;
        }

        return ways(m,n,dp);
    }
    public int ways( int m,int n,int[][]dp){
        if(m<=0 || n<=0) return 0;
        if(m==1 && n==1) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        int down =ways(m-1,n,dp);
        int right=ways(m,n-1,dp);
        return dp[m][n]= down+right;
    }
}
