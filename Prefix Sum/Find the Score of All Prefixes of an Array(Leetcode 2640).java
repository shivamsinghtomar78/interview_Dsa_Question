/*
Approach-1:Prefix Sum;
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public long[] findPrefixScore(int[] arr) {
        int n=arr.length;
        long[] ans=new long[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            ans[i]=(long)(arr[i]+max);
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}
