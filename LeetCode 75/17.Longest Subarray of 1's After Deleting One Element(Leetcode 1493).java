/*
Approach: brute force  ;
Time complexity:O(N^2);
Space complexity:O(1); */

class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int p=1;
            int count=0;
            for(int j=i;j<n;j++){
                if(p<0) break;
                if(nums[j]==0) {
                    p--;
                    continue;
                }
                count++;
            }
            if(count==n) count--;
            mx=Math.max(mx,count);
        }
        return mx;
    }
}

/*
Approach: sliding window and two pointer  ;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public int longestSubarray(int[] arr) {
        int n=arr.length;
        int zeroes=0;
        int len=0;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0) zeroes++;
            while(zeroes>1){
                if(arr[i]==0) zeroes--;
                i++;
            }
            len=Math.max(len,j-i);
        }
        return len;
    }
}

/*
Approach: sliding window and two pointer  ;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public int longestSubarray(int[] arr) {
        int i=0,j=0;
        int n=arr.length;
        int last_zeroes_idx=-1;
        int result=0;
        while(j<n){
            if(arr[j]==0){
                i= last_zeroes_idx+1;
                 last_zeroes_idx=j;
            }
            result=Math.max(result,j-i);
            j++;
        }
        return result;
    }
}
