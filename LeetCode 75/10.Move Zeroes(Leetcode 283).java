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

/*
Approach: Two pointer;
Time complexity:O(N);
Space complexity:O(1); */




class Solution {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) count++;
        }
        int i=0;
        int j=0;
        while(i<n && j<n){
            if( nums[i]==0 && nums[j]!=0 ){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if( nums[i]==0 && nums[j]==0 ){
               
                j++;
             }

            else {
                i++;
                j++;
            }
             
        }
    }
}

