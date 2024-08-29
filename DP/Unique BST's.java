/*
Approach-1:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n^2);
Space complexity:O(n);
Problem:https://www.geeksforgeeks.org/problems/unique-bsts-1587115621/1
*/
class Solution {
    // Function to return the total number of possible unique BSTs
    static int numTrees(int n) {
        if (n <= 1) return 1;
        
         
        long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;
        
         
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
                 
                dp[i] %= 1000000007;  
            }
        }
        
        // Cast to int before returning
        return (int) dp[n];
    }
}
