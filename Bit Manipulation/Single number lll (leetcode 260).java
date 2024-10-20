/*
Approach:HashMap ;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int[] singleNumber(int[] nums) {
          HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int freq=map.get(nums[i]);
                map.put(nums[i],1+freq);
            }
            else map.put(nums[i],1);
        }
        int []ans=new int[2];
        int i=0;
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq==1){
                ans[i]=key;
                i++;
            }
            if(i==2) break;
        }
        return ans;
    }
}
