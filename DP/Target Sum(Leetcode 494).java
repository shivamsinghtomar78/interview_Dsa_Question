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
