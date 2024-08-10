/*
Approach-1:Prefix Sum;
Time complexity:O(n);
Space complexity:O(n);
*/

class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int [] pre=new int[n];
        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i]=arr[i-1]*pre[i-1];
        }
        int []suf=new int[n];
        suf[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suf[i]=arr[i+1]*suf[i+1];
        }
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=pre[i]*suf[i];
        }
        return ans;
    }
}
