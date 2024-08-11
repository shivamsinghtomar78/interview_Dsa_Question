/*
Approach-1:Brute force;
Time complexity:O((n-k)*k);  
Time complexity:O(1);  */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<k+i;j++){
                sum+=arr[j];
            }
            if((sum/k)>=threshold) count++;
        }
        return count;
    }
}
