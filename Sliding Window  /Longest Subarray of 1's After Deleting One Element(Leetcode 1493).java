/*
Approach-1:sliding window
Time Complexity: O(N)
Space Complexity: O(1) */

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
Approach-2:sliding window(Optimal solution)
Time Complexity: O(N)
Space Complexity: O(1) */
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
