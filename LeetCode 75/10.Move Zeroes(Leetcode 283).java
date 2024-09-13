/*
Approach: Brute force ;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
       List<Integer> ans=new ArrayList<>();
       for(int ele:nums){
        if(ele!=0){
            ans.add(ele);
        }
       }
       for(int ele:nums){
        if(ele==0){
            ans.add(ele);
        }
       }
       for(int i=0;i<n;i++){
        nums[i]=ans.get(i);
       }
        
    }
}

