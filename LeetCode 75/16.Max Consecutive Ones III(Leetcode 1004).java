/*
Approach: sliding window and pointer ;
Time complexity:O(N);
Space complexity:O(1); */

class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length,i=0,zeroes=0,max=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0) zeroes++;
            while(zeroes>k){
                if(arr[i]==0) zeroes--;
                i++;
            }
            max=Math.max(max,j-i+1);

        }
        return max;

    }
}

/*
Approach: sliding window and two pointer  ;
Time complexity:O(N);
Space complexity:O(1); */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int zeroes=0;
        int maxLen=0;
        int mx=Integer.MIN_VALUE;
        while(r<n){
            if(nums[r]==0)  zeroes++;
            if(zeroes>k){
                if(nums[l]==0) zeroes--;
                l++;
            }
            if(zeroes<=k) {
                maxLen=r-l+1;
                mx=Math.max(mx,maxLen);
            }
            r++;

        }
        return mx;
    }
}
