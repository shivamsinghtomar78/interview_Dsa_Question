/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n);
Space complexity:O(n);
Problem:https://www.geeksforgeeks.org/problems/friends-pairing-problem5425/1
*/
class Solution
{
    private static final long MOD = 1000000007;

    public long countFriendsPairings(int n) { 
        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);
        return pair(n, dp);
    }
    
    public static long pair(int n, long[] dp) {
        if (n <= 2) return n;
        if (dp[n] != -1) return dp[n];
        
        long single = pair(n-1, dp) % MOD;
        long paired = ((n-1) * pair(n-2, dp)) % MOD;
        
        return dp[n] = (single + paired) % MOD;
    }
}    
 
