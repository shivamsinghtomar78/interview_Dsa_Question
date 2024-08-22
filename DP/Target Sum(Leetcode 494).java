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
