/*
Approach-1:Recurrsion;
Time complexity:O(2^n);
Space complexity:O(n);
*/
class Solution {
    int count;
    public int findTargetSumWays(int[] arr, int t) {
        return ways(0,0,arr,t);
    }
    public int ways(int i,int sum,int[]arr,int t){
        if(i==arr.length){
            if(sum==t) return ++count;
            else return count;
        }
         int add=ways(i+1,sum+arr[i] ,arr,t);
         int sub=ways(i+1,sum-arr[i],arr,t);
         return count;
    }
}
/*
Approach-2:Recurrsion;
Time complexity:O(2^n);
Space complexity:O(n);
*/

class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        return ways(0,arr,target);
    }
    public int ways(int i,int[]arr,int target){
        if(i==arr.length){
            if(target==0) return 1;
            else return 0;
        }
        int add=ways(i+1,arr,target-arr[i]);
         int sub=ways(i+1,arr,target+arr[i]);
         return add+sub;
    }
}
/*
Approach-3:Recurrsion and memoization;
Time complexity:O(n * (2 * sum + 1));
Space complexity:O(n * (2 * sum + 1));
*/

class Solution {
    int sum;
    public int findTargetSumWays(int[] arr, int target) {
        // i--> 0 to n-1 | target =-sum to sum
        // dp[i][target+sum]
        sum=0; int n=arr.length;
        for(int ele:arr) sum+=ele;
        int[][] dp=new int[n][2*sum+1];
        for(int i=0;i<dp.length;i++)
        for(int j=0;j<dp[0].length;j++) dp[i][j]=-1;
        return ways(0,arr,0,target,dp);
    }
    public int ways(int i,int[]arr,int res,int target,int[][]dp){
        if(i==arr.length){
            if(res==target) return 1;
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int add=ways(i+1,arr,res-arr[i], target,dp);
         int sub=ways(i+1,arr,res+arr[i], target,dp);
         return dp[i][res+sum]=add+sub;
    }
}
/*
Approach-4:Recurrsion and memoization with hashMap;
Time complexity:O(n * (2 * sum + 1));
Space complexity:O(n * (2 * sum + 1));
*/
class Solution {
    int sum;
    
    public int findTargetSumWays(int[] arr, int target) {
        sum = 0;
        for (int ele : arr) sum += ele;
        Map<String, Integer> memo = new HashMap<>();
        return ways(0, arr, 0, target, memo);
    }

    public int ways(int i, int[] arr, int res, int target, Map<String, Integer> memo) {
        if (i == arr.length) {
            return res == target ? 1 : 0;
        }
        
        String key = i + "," + res;
        
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        int add = ways(i + 1, arr, res + arr[i], target, memo);
        int sub = ways(i + 1, arr, res - arr[i], target, memo);
        
        memo.put(key, add + sub);
        
        return add + sub;
    }
}


