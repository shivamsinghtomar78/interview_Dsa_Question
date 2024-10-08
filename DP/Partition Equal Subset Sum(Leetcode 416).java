/*
Approach-2:Recursion + Memoization(DP);
Time complexity:O(n * target);
Space complexity:O(n * target);
*/

class Solution {
    public boolean canPartition(int[] arr) {
        int sum=0;
        for(int ele :arr) sum+=ele;
        if(sum%2!=0) return false;

         int target=sum/2;
        int[][] dp=new int[arr.length][target+1];
        for (int i = 0; i <dp.length ; i++)
            for (int j = 0; j <dp[0].length ; j++) dp[i][j]=-1;
       return subset(0,arr,target,dp);
      
    }
    private  boolean subset(int i, int[] arr, int target, int[][] dp) {
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans=false;
        boolean skip=subset(i+1,arr,target,dp);
        if(target-arr[i]<0) ans=skip;
        else {
            boolean pick=subset(i+1 ,arr,target-arr[i],dp);
            ans=pick ||skip;
        }
        if(ans) dp[i][target]=1;
        else dp[i][target]=0;
        return ans;
    }
}

/*
Approach-2:Bottom-up dp or iterative dp or tabulation dp;
Time complexity:O(n*target);
Space complexity:O(n*target);
*/

class Solution {
    public boolean canPartition(int[] arr) {
        int n=arr.length;
        int sum = 0;
        for (int ele : arr)
            sum += ele;
        if (sum % 2 != 0)
            return false;

        int target = sum / 2;
        int[][] dp = new int[arr.length][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                boolean ans = false;
                boolean skip =(i>0) ? (dp[i-1][j]==1):(j==0);
                if (j - arr[i] < 0)
                    ans = skip;
                else {
                    boolean pick =  (i>0) ?(dp[i-1][j-arr[i]]==1):(j==0);
                    ans = pick || skip;
                }
                 dp[i][j]=(ans) ? 1:0;
            }
        }

        return dp[n - 1][target] == 1;
    }
}

