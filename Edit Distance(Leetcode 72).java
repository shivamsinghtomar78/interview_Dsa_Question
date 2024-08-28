/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(m*n);
Space complexity:O(m*n);
*/
class Solution {
    public int minDistance(String word1, String word2) {
        StringBuilder a=new StringBuilder(word1);
        StringBuilder b=new StringBuilder(word2);
        int m = a.length();
        int n = b.length();
        int [][]dp=new int[m][n];
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++) dp[i][j]=-1;
        return lcs(m-1, n-1, a, b,dp);
    }
    public int lcs(int i, int j,StringBuilder  a,StringBuilder  b,int [][]dp) { 
       if(i==-1) return j+1;
       if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = lcs(i-1, j-1, a, b,dp);
        } else {
            int del=lcs(i-1,j,a,b,dp);
             int ins=lcs(i,j-1,a,b,dp);
              int rep=lcs(i-1,j-1,a,b,dp);
            return dp[i][j]=1+Math.min(del, Math.min(ins,rep));
        }
    }
}
