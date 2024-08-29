/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n^2);
Space complexity:O(n);
*/

class Solution {
    public int numTrees(int n) {
        if(n<=1) return 1;
        int []dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
