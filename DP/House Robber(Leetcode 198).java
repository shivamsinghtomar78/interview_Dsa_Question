/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int rob(int[] arr,int i,int n,int[]dp){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=arr[i]+rob(arr,i+2,n,dp);
        int skip=rob(arr,i+1,n,dp);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] arr) {
        int n=arr.length;
        int [] dp=new int[n];
        Arrays.fill(dp,-1);
        return rob(arr,0,n,dp);
    }
}



/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=arr[0];
        for(int i=2;i<=n;i++){
            int skip=dp[i-1];
            int rob=dp[i-2]+arr[i-1];
            dp[i]=Math.max(skip,rob);
        }
        return dp[n];
    }
}
