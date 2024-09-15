/*
Approach: sliding window  ;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=k-1;
        double mx=Integer.MIN_VALUE;
        double sum=0;
        for(int x=0;x<k;x++){
            sum+=(double)nums[x];
        }
        mx=Math.max(mx,(double)(sum/k));
        while(j<n-1){
           sum=sum-nums[i]+nums[j+1]; 
           mx=Math.max(mx,(double)(sum/k)); 
           i++;
           j++;
        }
        return mx;
    }
}
