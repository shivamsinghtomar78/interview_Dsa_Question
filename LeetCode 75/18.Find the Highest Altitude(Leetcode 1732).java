/*
Approach: prefix sum ;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int sum=0;
        int mx=Integer.MIN_VALUE;
        mx=Math.max(sum,mx);
        for(int i=0;i<n;i++){
            
            sum+=gain[i];
            mx=Math.max(sum,mx);

        }
        return mx;
    }
}
