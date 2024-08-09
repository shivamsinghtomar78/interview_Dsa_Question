/*
Approach-1:Prefix Sum;
Time complexity:sumRange:O(n);
Space complexity:O(1);
*/

class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        if(arr[n-1]-arr[0]==0) return 0;         
        int idx=0;
        boolean flag=false;
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[n-1]-arr[i] && i>0){
                idx=i;
                flag=true;
                break;
            }
             
        }
        if(flag) return idx;
        return -1;

         
        
    }
}
