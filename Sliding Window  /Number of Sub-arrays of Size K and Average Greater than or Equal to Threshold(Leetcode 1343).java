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
/*
Approach-1:Sliding window;
Time complexity:O((n);  
Time complexity:O(1);  */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = k - 1;
        int sum = 0;
        int count = 0;
        int n = arr.length;
        for (int x = 0; x < k; x++) {
            sum += arr[x];
        }
        if ((sum / k) >= threshold)
            count++;
        i++;
        j++;
        while (j < n) {
            sum = sum - arr[i - 1] + arr[j];
            if ((sum / k) >= threshold)
                count++;
            i++;
            j++;
        }
        return count;
    }
}
