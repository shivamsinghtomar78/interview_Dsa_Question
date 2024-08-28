/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(m*n);
Space complexity:O(m*n);
*/

class Solution {
    public int lcs(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) { 
        if (i == 0 || j == 0) return 0;  
        if (dp[i][j] != -1) return dp[i][j];
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
            return dp[i][j] = 1 + lcs(i - 1, j - 1, a, b, dp);
        } else {
            return dp[i][j] = Math.max(lcs(i - 1, j, a, b, dp), lcs(i, j - 1, a, b, dp));
        }
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder a = new StringBuilder(word1);
        StringBuilder b = new StringBuilder(word2);
        
        int[][] dp = new int[m + 1][n + 1];
        
        
        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= n; j++)
                dp[i][j] = -1;

        int lcsLength = lcs(m, n, a, b, dp);
        return (m + n - 2 * lcsLength);
    }
}

/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(m*n);
Space complexity:O(m*n);
*/
class Solution {
    public int minDistance(String a, String b) {
          
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return m+n-2*dp[m][n];
    }
}

/*
Approach-3:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(m*n);
Space complexity:O(n);
*/
class Solution {
    public int minDistance(String a, String b) {
          
         int m = a.length();
        int n = b.length();
        int[][] dp = new int[2][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                
                if (a.charAt(i-1) == b.charAt(j-1)) {
                    dp[1][j] = 1 + dp[0][j-1];
                } else {
                    dp[1][j] = Math.max(dp[0][j], dp[1][j-1]);
                }
            }
            // copy the first row to 0th row for next time
            for(int j=0;j<=n;j++) dp[0][j]=dp[1][j];
        }

        
        return m+n-2*dp[1][n];
    }

