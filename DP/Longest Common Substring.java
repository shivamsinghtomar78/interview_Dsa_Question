/*
Approach-1:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(m*n);
Space complexity:O(m*n);
Problem:https://www.geeksforgeeks.org/problems/longest-common-substring1452/1
*/
class Solution {
    public int longestCommonSubstr(String a, String b) {
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[m+1][n+1];
        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                
                else dp[i][j]=0;
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
        
    }
}
