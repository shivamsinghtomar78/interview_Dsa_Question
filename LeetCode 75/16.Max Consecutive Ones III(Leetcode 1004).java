/*
Approach: sliding window  ;
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
