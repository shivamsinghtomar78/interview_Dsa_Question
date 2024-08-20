/*
Approach-1:Recursion + Memoization(DP);
Time complexity:O(n*sqrt(n));
Space complexity:O(n);
*/
class Solution {
    public int numSquares(int n) {
      int [] dp=new int[n+1];
      Arrays.fill(dp,-1);
      return minNumber(n,dp);  
    }
    int minNumber(int n,int[] dp){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int minCount=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int result=1+minNumber(n-i*i,dp);
            minCount=Math.min(minCount,result);
        }
        return dp[n]=minCount;
    }
}
/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n*sqrt(n));
Space complexity:O(n);
*/

class Solution {
    boolean isPerfect(int n){
        int sqrt=(int)(Math.sqrt(n));
        return (sqrt*sqrt==n);
    }
    public int numSquares(int n) {
        int []dp=new int[n+1];
        for(int i=1;i<=n;i++){
            if(isPerfect(i)) dp[i]=1;
            else{
                int min=Integer.MAX_VALUE;
                for(int j=1;j*j<=i;j++){
                    int count=dp[j*j]+dp[i-j*j];
                    min=Math.min(min,count);
                }
                dp[i]=min;
            }
            
        }
         return dp[n];
}

}
