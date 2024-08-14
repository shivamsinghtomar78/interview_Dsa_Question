/*
Approach-1:Recurrsion;
Time complexity:O(2^n);
Space complexity:O(n);
*/

class Solution {
     public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public int fib(int n) {
        return fibo(n);
        
    }
}

/*
Approach-2:Recursion + Memoization(DP);
Time complexity:O(n);
Space complexity:O(n);
*/
class Solution {
    public int fibo(int n,int[]dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans=fibo(n-1,dp)+fibo(n-2,dp);
        dp[n]=ans;
        return ans;
    }
    public int fib(int n) {
       int [] dp=new int[n+1];// index from 0 to n
      return fibo(n,dp);  
    }
}

/*
Approach-3:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int fib(int n) {
       if(n<=1) return n;
       int [] dp=new int[n+1];
       dp[0]=0;
       dp[1]=1;
       for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
       } 
       return dp[n];
    }
}
