/*
Approach-2:Recursion + Memoization(DP);
Time complexity:O(n * target);
Space complexity:O(n * target);
*/

class Solution {
    public int lengthOfLongestSubsequence(List<Integer> arr, int target) {
        int[][] dp=new int[arr.size()+1][target+1];
        for(int i=0;i<arr.size()+1;i++)
        for(int j=0;j<target+1;j++) dp[i][j]=-1;
        int ans = length(0, arr, target,dp);
        return (ans <= 0) ? -1 : ans;
    }
    
    public int length(int i, List<Integer> arr, int target,int[][] dp) {
        if (target == 0) return 0;
        if (i == arr.size() || target < 0) return Integer.MIN_VALUE;
        if(dp[i][target]!=-1) return dp[i][target];
        
        int skip = length(i+1, arr, target,dp);
        int pick = length(i+1, arr, target - arr.get(i),dp);
        
        if (pick != Integer.MIN_VALUE) {
            pick += 1;
        }
        
        return dp[i][target]=Math.max(skip, pick);
    }
}
