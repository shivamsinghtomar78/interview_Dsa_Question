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


/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution
{
    public long countFriendsPairings(int n) 
    { 
        long []dp=new long[n+1];
        long md=1000000007;
        dp[1]=1;
        if(n>1) dp[2]=2;
        for(int i=3;i<n+1;i++){
            dp[i]=(dp[i-1]%md+((i-1)*dp[i-2])%md)%md;
        }
        return dp[n];
    }
}    
 
 
