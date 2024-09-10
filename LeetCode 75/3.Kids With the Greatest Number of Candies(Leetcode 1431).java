/*
Approach:  ArrayList 
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int x) {
        int n=arr.length;
        List<Boolean> ans=new ArrayList<>();
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(arr[i],mx);
        }
        for(int i=0;i<n;i++){
            if((arr[i]+x)>=mx){
                ans.add(true);
            }
            else ans.add(false);
        }
        return ans;
    }
}
