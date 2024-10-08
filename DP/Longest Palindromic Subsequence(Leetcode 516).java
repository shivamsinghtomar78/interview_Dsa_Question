/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n^2);
Space complexity:O(n^2);
*/
class Solution {
    public int lcs(int i, int j, String a, String b, int[][] dp) { 
        if (i < 0 || j < 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = 1 + lcs(i-1, j-1, a, b, dp);
        } else {
            return dp[i][j] = Math.max(lcs(i-1, j, a, b, dp), lcs(i, j-1, a, b, dp));
        }
    }

    public int longestPalindromeSubseq(String s) {
        String a = s;
        String b = new StringBuilder(s).reverse().toString();
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++) 
                dp[i][j] = -1;
        return lcs(m-1, n-1, a, b, dp);
    }
}

/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n^2);
Space complexity:O(n^2);
*/
class Solution {
    public int longestPalindromeSubseq(String s) {
        String a = s;
        String b = new StringBuilder(s).reverse().toString();
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

        return dp[m][n]; 
    }
}


/*
Approach-3:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n^2);
Space complexity:O(n);
*/

class Solution {
    public int longestPalindromeSubseq(String s) {
        String a = s;
        String b = new StringBuilder(s).reverse().toString();
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

        return dp[1][n];
    }
}


