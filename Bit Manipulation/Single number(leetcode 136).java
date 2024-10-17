/*
Approach:Brute force ;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int freq=map.get(nums[i]);
                map.put(nums[i],1+freq);
            }
            else map.put(nums[i],1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}
